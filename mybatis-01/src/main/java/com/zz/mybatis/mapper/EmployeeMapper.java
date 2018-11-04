package com.zz.mybatis.mapper;

import com.zz.mybatis.entity.Employee;
import com.zz.mybatis.util.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by tao.zeng on 2017/9/29.
 */
public interface EmployeeMapper extends BaseMapper<Employee, Long> {


    List<Employee> findEmpByDeptId(@Param("deptId") long id);
}
