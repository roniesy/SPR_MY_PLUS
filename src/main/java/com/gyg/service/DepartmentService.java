package com.gyg.service;

import com.gyg.mapper.DepartmentMapper;
import com.gyg.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    public List<Department> queryAllDepart(){
        return departmentMapper.queryAllDepart();
    };
}
