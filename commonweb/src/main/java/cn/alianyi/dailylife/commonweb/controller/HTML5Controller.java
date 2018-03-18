package cn.alianyi.dailylife.commonweb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/html5")
public class HTML5Controller {

    @RequestMapping("/polystar/contact")
    public ModelAndView polystarContact() {
        ModelAndView mv = new ModelAndView("html5/polystar/contact");
        return mv;
    }

    @RequestMapping("/polystar/index")
    public ModelAndView polystarIndex() {
        ModelAndView mv = new ModelAndView("html5/polystar/index");
        return mv;
    }

    @RequestMapping("/polystar/services")
    public ModelAndView polystarServices() {
        ModelAndView mv = new ModelAndView("html5/polystar/services");
        return mv;
    }

    @RequestMapping("/polystar/team")
    public ModelAndView polystarTeam() {
        ModelAndView mv = new ModelAndView("html5/polystar/team");
        return mv;
    }

}
