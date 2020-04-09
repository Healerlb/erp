package com.csdj.controller;

import com.csdj.pojo.Employee;
import com.csdj.service.TestService;
import com.csdj.service.impl.TestServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/jsl")
public class TestController {


    @Autowired
    TestServiceimpl serviceimpl;

    @RequestMapping("/test")
    public  String test(){
        return "test";
    }


    @RequestMapping("/getshow")
    public String getshow(Model model){
        List<Employee> list=serviceimpl.getemplist();
        model.addAttribute("list",list);
        return "index";
    }


}
