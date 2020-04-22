package com.mybatis_plus.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mybatis_plus.mapper.UserMapper;
import com.mybatis_plus.model.UserModel;
import com.mybatis_plus.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Author: LiuRunYong
 * @Date: 2020/4/22
 **/

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<UserModel> selectALlUserList() {
        return userMapper.selectList(new QueryWrapper<>());
    }
}
