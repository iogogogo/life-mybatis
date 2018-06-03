package com.z.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.List;

/**
 * Created by tao.zeng on 2017/9/29.
 */
@Data
@Alias("dept")
@AllArgsConstructor
@NoArgsConstructor
public class Dept implements Serializable {

    private long deptId;

    private String deptName;

    private List<Employee> employees;
}
