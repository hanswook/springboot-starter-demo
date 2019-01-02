package com.hans.spingbootDemo.controller.interceptor;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("one")
public class OneController {


    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("name", "hansName");
        return "thymeleaf/index";
    }

    @RequestMapping("/center")
    public String center() {
        return "thymeleaf/center/center";
    }



}
