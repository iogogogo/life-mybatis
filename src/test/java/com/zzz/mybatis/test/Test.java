package com.zzz.mybatis.test;

import com.alibaba.fastjson.JSON;
import com.zzz.mybatis.entity.User;
import com.zzz.mybatis.mapper.UserMapper;
import com.zzz.mybatis.util.IdHelper;
import com.zzz.mybatis.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;

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

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Test.class);

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

    @org.junit.Test
    public void test1() {
        System.out.println(mapper.findById(6395192397256462336L).getName());
        System.out.println("*****************************************");
        System.out.println(mapper.findById(6395192397256462336L).getName());
    }

    @org.junit.Test
    public void test2() {
        User user = new User();
        user.before();
        user.setName("123");
        user.setPassword(IdHelper.uuid());
        int res = mapper.save(user);
        sqlSession.commit();
        assert res > 0;
    }

    @org.junit.Test
    public void test3() {
        User user = new User();
        user.setId(6408303361833046016L);
        user.setPassword(IdHelper.uuid());
        int res = mapper.update(user);
        log.info("修改结果:{}", res);
        sqlSession.commit();
        assert res > 0;
    }

    @org.junit.Test
    public void test4() {
        int res = mapper.delete(6408303361833046016L);
        sqlSession.commit();
        assert res > 0;
    }
}
