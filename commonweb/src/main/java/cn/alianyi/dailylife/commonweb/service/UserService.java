package cn.alianyi.dailylife.commonweb.service;

import cn.alianyi.dailylife.commondao.dao.User;
import cn.alianyi.dailylife.commondao.dao.UserRepos;
import cn.alianyi.dailylife.commondao.service.UserServiceImpl;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class UserService {

    @Autowired
    private UserServiceImpl userService;

    public void saveUser(){
        User user = new User();
        user.setEmail("1410990739@qq.com");
        user.setLevel("1");
        user.setHeadPortrait("www");
        user.setMobileNo("19919005174");
        user.setPassword("123456");
        user.setRegisterTime(new Date());
        user.setRegion("0");
        userService.saveUser(user);
    }
}
