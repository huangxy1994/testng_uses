package com.example.annotation_uses;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.*;

/**
 * @Description: 使用@BeforeSuite、@AfterSuite、@BeforeTest、@AfterTest
 * @Author: 黄晓阳
 * @CreateTime: 2019-09-22 11:56
 */
@Slf4j
public class Test5 {
    @BeforeSuite
    public void beforeSuite() {
        log.info("test5 beforeSuite----------");
    }

    @AfterSuite
    public void afterSuite() {
        log.info("test5 afterSuite----------");
    }

    @BeforeTest
    public void beforeTest() {
        log.info("test5 beforeTest-------");
    }

    @AfterTest
    public void afterTest() {
        log.info("test5 afterTest-------");
    }

    @Test
    public void func1() {
        log.info("test5 func1-----");
    }

    @Test
    public void func2() {
        log.info("test5 func2-----");
    }
}
