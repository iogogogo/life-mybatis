package com.z.mybatis.mapper;

import com.z.mybatis.entity.Employee;
import com.z.mybatis.util.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by tao.zeng on 2017/9/29.
 */
public interface EmployeeMapper extends BaseMapper<Employee, Long> {


    List<Employee> findEmpByDeptId(@Param("deptId") long id);
}
