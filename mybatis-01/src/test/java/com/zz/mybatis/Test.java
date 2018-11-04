package com.zz.mybatis;

import com.alibaba.fastjson.JSON;
import com.zz.mybatis.entity.User;
import com.zz.mybatis.mapper.UserMapper;
import com.zz.mybatis.util.IdHelper;
import com.zz.mybatis.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author tao.zeng.
 * @since 2018/4/26.
 */
public class Test {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private SqlSession sqlSession;
    private UserMapper mapper;

    @After
    public void after() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }


    @Before
    public void before() {
        sqlSession = SqlSessionFactoryUtil.openSqlSession();
        mapper = sqlSession.getMapper(UserMapper.class);
    }


    @org.junit.Test
    public void test() {
        List<User> list = mapper.findAll();
        System.out.println(JSON.toJSONString(list));
        List<User> list1 = mapper.findAll();
        System.out.println(JSON.toJSONString(list1));
    }

    @Ignore
    @org.junit.Test
    public void test1() {
        System.out.println(mapper.findById(6464683977264336896L).getName());
        System.out.println("*****************************************");
        System.out.println(mapper.findById(6464683977264336896L).getName());
    }

    @org.junit.Test
    public void test2() {
        User user = new User();
        user.before();
        user.setName("user_name" + IdHelper.uuid());
        user.setPassword(IdHelper.uuid());
        int res = mapper.save(user);
        sqlSession.commit();
        assert res > 0;
    }

    @org.junit.Test
    public void test3() {
        User user = new User();
        user.setId(6464683977264336896L);
        user.setPassword(IdHelper.uuid());
        int res = mapper.update(user);
        logger.info("修改结果:{}", res);
        sqlSession.commit();
        logger.info("result:", res > 0);
    }

    @org.junit.Test
    public void test4() {
        int res = mapper.delete(6464683977264336896L);
        sqlSession.commit();
        logger.info("result:", res > 0);
    }
}
