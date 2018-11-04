package com.zz.mybatis.mapper2;

import com.zz.mybatis.entity.Dept;
import com.zz.mybatis.util.BaseMapper;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by tao.zeng on 2017/10/8.
 */
public interface DeptMapper extends BaseMapper<Dept, Long> {

    @Select("select * from dept")
    @Results({
            @Result(property = "deptId", column = "dept_id"),
            @Result(property = "deptName", column = "dept_name"),
            @Result(many = @Many(select = "com.zz.mybatis.mapper.EmployeeMapper.findEmpByDeptId"), column = "dept_id", property = "employees")
    })
    List<Dept> findAll();
}
