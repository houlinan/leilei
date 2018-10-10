package cn.hgxsp.leileigongzuoshi.controller;

import cn.hgxsp.leileigongzuoshi.Utils.LLJSONResult;
import cn.hgxsp.leileigongzuoshi.entity.Team;
import cn.hgxsp.leileigongzuoshi.entity.User;
import cn.hgxsp.leileigongzuoshi.service.SearchService;
import cn.hgxsp.leileigongzuoshi.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;
import sun.rmi.runtime.Log;

import java.util.List;

/**
 * DESC：搜索相关controller
 * CREATED BY ：@hou.linan
 * CREATED DATE ：2018/10/10
 * Time : 16:37
 */
@RestController
@RequestMapping("/search")
@Slf4j
public class SearchController {

    @Autowired
    SearchService  searchService ;

    @Autowired
    UserService userService ;

    @GetMapping("/findAllUserNamesByTeam")
    public LLJSONResult findAllUserNamesByTeam(String userId) {

        if(StringUtils.isEmpty(userId)) return LLJSONResult.errorMsg("您传入的用户Id为空");

        User user = userService.findUserById(userId);

        if(ObjectUtils.isEmpty(user)) return LLJSONResult.errorMsg("对不起没有找到您的用户信息") ;

        Team team = user.getFromTeam();
        if (ObjectUtils.isEmpty(team)) return LLJSONResult.errorMsg("对不起，您没有绑定任何Team，请绑定后重试") ;

        List<String> currAllTeamUserName = searchService.getCurrAllTeamUserName(team);
        log.info("获取的结果为：{}"  ,currAllTeamUserName);
        return LLJSONResult.ok(currAllTeamUserName) ;
    }

}
