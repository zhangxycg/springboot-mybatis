package com.zxy.springboot.pojo;

/**
 * @Description:
 * @Author: zhangxy
 * @Date: Created in 2019/12/24
 */
public class Department {

    private Integer id;
    private String departmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
