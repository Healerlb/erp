package com.csdj.serviceimpl;

import com.csdj.dao.Grademapper;
import com.csdj.pojo.grade;
import com.csdj.service.Gradeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Gradeserviceimpl implements Gradeservice {

    @Autowired
    private Grademapper grademapper;

    @Override
    public List<grade> getgrade() {
        return grademapper.selectAll();
    }
}
