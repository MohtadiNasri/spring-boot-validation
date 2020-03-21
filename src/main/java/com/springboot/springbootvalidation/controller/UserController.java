package com.springboot.springbootvalidation.controller;

import com.springboot.springbootvalidation.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @RequestMapping("add")
    public String toAdd(User user) {
        //instead of writing add.html
        return "add";
    }

    @RequestMapping("addUser")
    public String add(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            //if you are miss-filled any input field you will redirected to the same page with errors !
            return "add";
        }
        System.out.println("Save user =" + user.toString());
        return "success";
    }
}
