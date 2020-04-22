package com.mybatis_plus.service;

import com.mybatis_plus.model.UserModel;

import java.util.List;

/**
 * @Description:
 * @Author: LiuRunYong
 * @Date: 2020/4/22
 **/
public interface UserService {


    /**
     * 查询所有用户信息
     *
     * @return list
     */
    List<UserModel> selectALlUserList();

}
