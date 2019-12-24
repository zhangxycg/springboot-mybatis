package com.zxy.springboot.controller;

import com.zxy.springboot.mapper.DepartmentMapper;
import com.zxy.springboot.pojo.Department;
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
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    /**
     * 根据id进行查询
     *
     * @param id
     * @return
     */
    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        return departmentMapper.getDeptById(id);
    }

    /**
     * 新增部门信息
     *
     * @param department
     * @return
     */
    @GetMapping("/dept")
    public Department insertDept(Department department) {
        departmentMapper.insertDept(department);
        return department;
    }
}
