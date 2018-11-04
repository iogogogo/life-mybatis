package com.zz.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by tao.zeng on 2017/9/29.
 */
@Alias("emp")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {

    private long id;

    private String name;

    private Dept dept;

    private int age;

    private Date birthday;
}
