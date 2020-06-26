package com.bob.controller;

import com.bob.bean.UserInfo;
import com.bob.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author WangJun
 * @since 2020/6/26
 */
@Controller
@RequestMapping(path = "/userinfo")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    
    public int insert(UserInfo record) {
        return 0;
    }

    @RequestMapping(path = "/add")
    public ModelAndView insertSelective(UserInfo record) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        int succ = userInfoService.insertSelective(record);
        mv.addObject("succ", String.valueOf(new Integer(succ)));
        mv.addObject("test", "test");
        return mv;
    }

    
    public UserInfo selectByPrimaryKey(Long id) {
        return null;
    }

    
    public int updateByPrimaryKeySelective(UserInfo record) {
        return 0;
    }

    
    public int updateByPrimaryKey(UserInfo record) {
        return 0;
    }
}
