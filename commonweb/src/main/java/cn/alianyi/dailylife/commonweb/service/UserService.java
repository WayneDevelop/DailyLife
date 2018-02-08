package cn.alianyi.dailylife.commonweb.service;


import cn.alianyi.dailylife.commoninterface.domain.User;
import cn.alianyi.dailylife.commoninterface.service.IUserService;
import com.alibaba.dubbo.config.annotation.Reference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class UserService {

    @Reference
    private IUserService userDubbo;

    public void saveUser(){
        User user = new User();
        user.setEmail("1410990739@qq.com");
        user.setLevel("1");
        user.setHeadPortrait("www");
        user.setMobileNo("19919005174");
        user.setPassword("123456");
        user.setRegisterTime(new Date());
        user.setRegion("0");
        userDubbo.saveUser(user);
    }
}
