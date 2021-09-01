package com.gyg.service;

import com.gyg.mapper.EmployeeMapper;
import com.gyg.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public List<Employee> queryAllEmp(){
        return employeeMapper.queryAllEmp();
    };

    public Employee queryEmpById(int id){
        return employeeMapper.queryEmpById(id);
    };

    public int addEmp(Employee employee){
        return employeeMapper.addEmp(employee);
    };

    public int updateEmp(Employee employee){
        return employeeMapper.updateEmp(employee);
    };

    public int deleteEmpById(int id){
        return employeeMapper.deleteEmpById(id);
    };
}
