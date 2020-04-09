package com.csdj.service.impl;

import com.csdj.mapper.Testmapper;
import com.csdj.pojo.Employee;
import com.csdj.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("serviceimpl")
public class TestServiceimpl implements TestService {

    @Autowired
   Testmapper testmapper;

    @Override
    public List<Employee> getemplist(){
        return testmapper.getemplist();
    }

}
