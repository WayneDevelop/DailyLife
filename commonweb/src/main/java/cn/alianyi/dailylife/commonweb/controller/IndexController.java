package cn.alianyi.dailylife.commonweb.controller;

import cn.alianyi.dailylife.commonweb.service.UserService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("/init")
    public String init() {
        userService.saveUser();
        return "init";
    }
}
