package com.iogogogo.mapper;

import com.iogogogo.entity.DeviceEntity;

/**
 * Created by tao.zeng on 2019-04-04.
 */
public interface DeviceMapper {

    DeviceEntity findByKey(String devKey);
}
