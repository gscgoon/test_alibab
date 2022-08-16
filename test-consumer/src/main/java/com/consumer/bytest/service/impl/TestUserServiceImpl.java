package com.consumer.bytest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.consumer.bytest.entity.TestUser;
import com.consumer.bytest.mapper.TestUserMapper;
import com.consumer.bytest.service.TestUserService;
import org.springframework.stereotype.Service;

@Service
public class TestUserServiceImpl extends ServiceImpl<TestUserMapper, TestUser> implements TestUserService {

}