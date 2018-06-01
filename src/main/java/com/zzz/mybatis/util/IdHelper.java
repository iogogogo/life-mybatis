package com.zzz.mybatis.util;

import com.relops.snowflake.Snowflake;

import java.io.Serializable;
import java.util.UUID;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author tao.zeng.
 * @since 2018/4/23.
 */
public class IdHelper implements Serializable {

    private final static Snowflake SNOWFLAKE = new Snowflake(1);

    public static long id() {
        return SNOWFLAKE.next();
    }

    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }
}
