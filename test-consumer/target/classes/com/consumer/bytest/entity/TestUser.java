package com.consumer.bytest.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 测试用户类
 */
@Data
@TableName("test_user")
@AllArgsConstructor
@NoArgsConstructor
public class TestUser {

    @TableId("id")
    private Integer id;
    private String name;
    private Integer age;
}