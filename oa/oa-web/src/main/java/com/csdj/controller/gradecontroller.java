package com.csdj.controller;


import com.csdj.pojo.grade;
import com.csdj.service.Gradeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class gradecontroller {

    @Autowired
   private Gradeservice gradeservice;

    @GetMapping("show")
    public  List<grade> getshow(){
        return  gradeservice.getgrade();
    }


}
