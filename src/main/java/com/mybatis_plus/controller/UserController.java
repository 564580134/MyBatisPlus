package com.mybatis_plus.controller;

import com.mybatis_plus.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: LiuRunYong
 * @Date: 2020/4/22
 **/
@Slf4j
@RestController
@RequestMapping("/user/")
public class UserController {


    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("list")
    public Map<String, Object> listAll() {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("data", userService.selectALlUserList());
        result.put("msg", "success");
        return result;

    }
}
