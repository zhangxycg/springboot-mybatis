package com.zxy.springboot.controller;

import com.zxy.springboot.mapper.EmployeeMapper;
import com.zxy.springboot.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: zhangxy
 * @Date: Created in 2019/12/24
 */
@RestController
public class EmpController {

    @Autowired
    EmployeeMapper employeeMapper;

    /**
     * 根据id查询员工信息
     *
     * @param id
     * @return
     */
    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id) {
        return employeeMapper.getEmpById(id);
    }

    /**
     * 新增员工信息
     *
     * @param employee
     * @return
     */
    @GetMapping("/emp")
    public Employee insertEmp(Employee employee) {
        employeeMapper.insertEmp(employee);
        return employee;
    }
}
