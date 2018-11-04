package com.zz.mybatis.entity;

import com.zz.mybatis.util.IdHelper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author tao.zeng.
 * @since 2018/4/23.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private Long id;

    private String name;

    private String password;

    private Date createDate;

    private Date updateDate;

    public void before() {
        this.id = IdHelper.id();
        this.createDate = new Date();
        this.updateDate = createDate;
    }
}
