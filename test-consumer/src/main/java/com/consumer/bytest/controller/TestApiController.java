package com.consumer.bytest.controller;


import com.consumer.bytest.entity.TestUser;
import com.consumer.bytest.service.TestUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "用户接口")
@RestController
@CrossOrigin
@RequestMapping("/test/api/")
public class TestApiController {

    @Autowired
    private TestUserService testUserService;

    @ApiOperation("获取所有的用户")
    @GetMapping("getUsers")
    private List<TestUser> getUsers(){
        List<TestUser> list = testUserService.list();
        return list;
    }
}
