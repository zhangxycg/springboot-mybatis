package com.zxy.springboot.mapper;

import com.zxy.springboot.pojo.Department;
import org.apache.ibatis.annotations.*;

/**
 * @Description:
 * @Author: zhangxy
 * @Date: Created in 2019/12/24
 */
@Mapper // 指定这是一个操作数据库的mapper,将接口扫描到容器中
public interface DepartmentMapper {

    /**
     * 查询
     *
     * @param id
     * @return
     */
    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    /**
     * 新增
     *
     * @param department
     * @return
     */
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("Insert into department(department_name) values(#{departmentName})")
    public int insertDept(Department department);

    /**
     * 更新
     *
     * @param department
     * @return
     */
    @Update("update department set department_name=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
