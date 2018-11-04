package com.zz.mybatis.util;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * <p> mapper 基类
 * </p>
 *
 * @author tao.zeng.
 * @since 2018/4/26.
 */
public interface BaseMapper<M extends Serializable, PK extends Serializable> {

    /**
     * 查询所有数据
     *
     * @return
     */
    List<M> findAll();

    /**
     * 根据 id 查询数据
     *
     * @param id
     * @return
     */
    M findById(PK id);

    /**
     * 保存数据
     *
     * @param m
     * @return
     */
    int save(M m);

    /**
     * 修改数据
     *
     * @param m
     * @return
     */
    int update(M m);

    /**
     * 删除数据
     *
     * @param id
     * @return
     */
    int delete(PK id);
}
