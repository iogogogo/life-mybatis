package com.iogogogo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by tao.zeng on 2019-04-04.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppEntity {

    private int id;

    private String appKey;

    private String desc;

    private List<DeviceEntity> deviceList;
}
