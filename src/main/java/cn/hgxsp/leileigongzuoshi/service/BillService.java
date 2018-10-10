package cn.hgxsp.leileigongzuoshi.service;

import cn.hgxsp.leileigongzuoshi.DAO.BillDao;
import cn.hgxsp.leileigongzuoshi.entity.AccountNum;
import cn.hgxsp.leileigongzuoshi.entity.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * DESC：
 * CREATED BY ：@hou.linan
 * CREATED DATE ：2018/10/9
 * Time : 16:31
 */
@Service
public class BillService {

    @Autowired
    BillDao billDao ;

    public void save(Bill bill ){
        bill.setCreateTime(new Date());
        billDao.save(bill );
    }

    public Page<Bill> findByAccountNum (AccountNum accountNum , Integer pageIndex , Integer pageSize){
        Sort sort = new Sort(Sort.Direction.DESC, "createTime");
        PageRequest page = new PageRequest(pageIndex-1 , pageSize , sort) ;
        return billDao.findAllByFromAccountNum(accountNum, page);
    }

}
