package com.iogogogo.test;

import com.iogogogo.entity.AppEntity;
import com.iogogogo.entity.DeviceEntity;
import com.iogogogo.mapper.AppMapper;
import com.iogogogo.mapper.DeviceMapper;
import com.iogogogo.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by tao.zeng on 2019-04-04.
 */
public class TestMapper {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private SqlSession sqlSession;
    private AppMapper mapper;
    private DeviceMapper deviceMapper;

    @After
    public void after() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }


    @Before
    public void before() {
        sqlSession = SqlSessionFactoryUtil.openSqlSession();
        mapper = sqlSession.getMapper(AppMapper.class);
        deviceMapper = sqlSession.getMapper(DeviceMapper.class);
    }

    @org.junit.Test
    public void test() {
        List<AppEntity> list = mapper.list();
        DeviceEntity entity = deviceMapper.findByKey("dev_014");
        logger.info("{} {}", list, entity);
    }

}
