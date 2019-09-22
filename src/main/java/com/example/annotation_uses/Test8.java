package com.example.annotation_uses;

import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @Description: 使用@DataProvider
 * @Author: 黄晓阳
 * @CreateTime: 2019-09-22 11:56
 */
@Slf4j
public class Test8 {

    @Test
    @Parameters({"name"})
    public void fun1(String name) {
        log.info(name);
    }

    @Test
    @Parameters("test")
    public void func2(@Optional("t1") String t) {
        log.info(t);
    }
}
