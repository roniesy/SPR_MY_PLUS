package com.gyg.mapper;

import com.gyg.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {

    List<Employee> queryAllEmp();

    Employee queryEmpById(int id);

    int addEmp(Employee employee);

    int updateEmp(Employee employee);

    int deleteEmpById(int id);

}
