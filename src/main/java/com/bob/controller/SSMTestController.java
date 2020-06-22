package com.bob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author WangJun
 * @Date 2020/6/22
 */
@Controller
@RequestMapping("/test")
public class SSMTestController {
    @RequestMapping("/test01")
    public ModelAndView test01(){
        System.out.println("SSMTestController test01");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("ssm_test");
        return mv;
    }
}
