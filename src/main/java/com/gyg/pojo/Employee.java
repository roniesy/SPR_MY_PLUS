package com.gyg.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 员工表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;

    private Integer did;

    private Date birth;

    private Department department;

/*    public Employee(Integer id, String lastName, String email, Integer gender, Integer did, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
//        默认创建日期

        this.birth = new Date();
    }*/
}
