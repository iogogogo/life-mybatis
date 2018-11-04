package com.zz.mybatis;

import com.zz.mybatis.entity.Dept;
import com.zz.mybatis.mapper2.DeptMapper;
import com.zz.mybatis.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class Test2 {

    private SqlSession sqlSession;
    private DeptMapper deptMapper;

    @Before
    public void before() {
        sqlSession = SqlSessionFactoryUtil.openSqlSession();
        deptMapper = sqlSession.getMapper(DeptMapper.class);
    }

    @After
    public void after() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    @Test
    public void test() {
        List<Dept> list = deptMapper.findAll();
        for (Dept dept : list) {
            System.out.println("部门对象:" + dept);
        }
    }
}
