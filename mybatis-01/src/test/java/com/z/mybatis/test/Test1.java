package com.z.mybatis.test;

import com.z.mybatis.entity.Dept;
import com.z.mybatis.mapper.DeptMapper;
import com.z.mybatis.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;

import java.util.List;

public class Test1 {

    private SqlSession session;
    private DeptMapper mapper;

    @Before
    public void before() {
        session = SqlSessionFactoryUtil.openSqlSession();
        mapper = session.getMapper(DeptMapper.class);
    }

    @After
    public void after() {
        if (session != null) {
            session.close();
        }
    }


    @org.junit.Test
    public void test() {
        List<Dept> depts = mapper.findAll();
        for (Dept dept : depts) {
            System.out.println(dept);
        }
    }

    @org.junit.Test
    public void test1() {
        Dept dept = mapper.findById(2L);
        System.out.println(dept);
    }

    @org.junit.Test
    public void test2() {
        Dept dept = new Dept();
        dept.setDeptName("后勤保障部");
        int i = mapper.save(dept);
        // 注意这增删改需要提交事务对象
        System.out.println(i > 0 ? "success" : "failure");
        session.commit();
        assert i > 0;
    }

    @org.junit.Test
    public void test3() {
        Dept dept = new Dept();
        dept.setDeptId(7L);
        dept.setDeptName("鸡犬不宁部");
        int i = mapper.update(dept);
        // 注意这增删改需要提交事务对象
        session.commit();
        System.out.println(i > 0 ? "success" : "failure");
        assert i > 0;
    }

    @org.junit.Test
    public void test4() {
        int i = mapper.delete(7L);
        // 注意这增删改需要提交事务对象
        session.commit();
        System.out.println(i > 0 ? "success" : "failure");
        assert i > 0;
    }
}
