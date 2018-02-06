package cn.alianyi.dailylife.commonweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/init")
    public String init() {
        return "init";
    }
}
