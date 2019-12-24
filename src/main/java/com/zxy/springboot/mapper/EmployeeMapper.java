package com.zxy.springboot.mapper;

import com.zxy.springboot.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @Description:
 * @Author: zhangxy
 * @Date: Created in 2019/12/24
 */
@Mapper
public interface EmployeeMapper {

    /**
     * 根据id查询员工信息
     *
     * @param id
     * @return
     */
    public Employee getEmpById(Integer id);

    /**
     * 新增员工信息
     *
     * @param employee
     */
    public void insertEmp(Employee employee);
}
