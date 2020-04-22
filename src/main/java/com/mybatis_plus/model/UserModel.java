package com.mybatis_plus.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Description: 用户信息
 * @Author: LiuRunYong
 * @Date: 2020/4/22
 **/


@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName(value = "user")
public class UserModel {

    /**
     * 用户主键
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户账号
     */
    private String account;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户电话
     */
    private String phone;

    /**
     * 用户性别(0:男,1:女)
     */
    private Integer sex;

    /**
     * 用户年龄
     */
    private Integer age;

    /**
     * 用户状态
     */
    private Integer status;
}
