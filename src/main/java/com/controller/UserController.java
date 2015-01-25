package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/1/3.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Resource(name = "userServiceImpl")
    private UserService userService;


    @RequestMapping(value = "**/list")
    public ModelAndView getAllUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();

        List<User> result = new ArrayList<User>();
        result = userService.findAll();

        map.put("result", result);
        return new ModelAndView("/user/list", map);
    }

    @RequestMapping(value = "**/list/{id}")
    public ModelAndView getTheUser(@PathVariable("id") int id) {
        Map<String, Object> map = new HashMap<String, Object>();

        List<User> result = new ArrayList<User>();
        result.add(userService.findById(id));
        map.put("result", result);

        return new ModelAndView("/user/list", map);
    }


    @RequestMapping(value = "**/toAdd")
    public ModelAndView toAddUser() {
        return new ModelAndView("/user/adds");
    }

    @RequestMapping(value = "**/doAdd")
    public String addUser(User user) {
        userService.create(user);

        Map<String, Object> map = new HashMap<String, Object>();

        List<User> result = new ArrayList<User>();
        result = userService.findAll();

        map.put("result", result);
        return "redirect:list";
    }

    @RequestMapping(value = "**/delete/{id}")
    public String deleteTheUser(@PathVariable("id") int id) {
        Map<String, Object> map = new HashMap<String, Object>();

        userService.delete(id);

        List<User> result = new ArrayList<User>();
        result = userService.findAll();
        map.put("result", result);

        return "redirect:/user/list";
    }

}
