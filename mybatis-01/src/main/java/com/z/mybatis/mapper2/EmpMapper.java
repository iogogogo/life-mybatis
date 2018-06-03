package com.z.mybatis.mapper2;

import com.z.mybatis.entity.Employee;
import com.z.mybatis.util.BaseMapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by tao.zeng on 2017/10/8.
 */
public interface EmpMapper extends BaseMapper<Employee, Long> {

    @Select("select * from employee as a,dept as b where a.dept_id = b.dept_id")
    @Results({
            @Result(one = @One(select = "com.z.mybatis.mapper.DeptMapper.findById"), property = "dept", column = "dept_id")
    })
    List<Employee> findAll();
}
