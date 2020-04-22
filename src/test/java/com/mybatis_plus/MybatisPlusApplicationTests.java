package com.mybatis_plus;

import com.mybatis_plus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Resource
    UserService userService;

    @Test
    void contextLoads() {
        userService.selectALlUserList().forEach(
                userModel -> {
                    System.out.println("userModel:" + userModel.toString());
                });
    }

}
