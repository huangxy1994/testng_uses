package com.example.basics.group_uses;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * @Description: 分组测试-在类上分组
 * @Author: 黄晓阳
 * @CreateTime: 2019-09-22 23:26
 */
@Slf4j
@Test(groups = "group6")
public class Test5 {
    @Test
    public void func1() {
        log.info("Test5 -- func1");
    }

    @Test
    public void func2() {
        log.info("Test5 -- func2");
    }
}
