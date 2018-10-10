package cn.hgxsp.leileigongzuoshi.service;

import cn.hgxsp.leileigongzuoshi.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DESC：搜索相关service层
 * CREATED BY ：@hou.linan
 * CREATED DATE ：2018/10/10
 * Time : 16:18
 */
@Service
public class SearchService {

    @Autowired
    BillDao billDao;


    /**
    *DESC: 获取本小组的所有用户名称
    *@author hou.linan
    *@date:  2018/10/10 16:20
    *@param:  [userId]
    *@return:  java.util.List<java.lang.String>
    */
    public List<String>  getCurrAllTeamUserName(Team team){

        List<String> seachUsernames = billDao.findOperUserNameByTeam(team);

        return seachUsernames ;
    }



}
