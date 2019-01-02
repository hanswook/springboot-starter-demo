package com.hans.spingbootDemo.controller.interceptor;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("two")
public class TwoController {

    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("name", "two");
        return "thymeleaf/index";
    }

    @RequestMapping("/center")
    public String center() {
        return "thymeleaf/center/center";
    }


}
