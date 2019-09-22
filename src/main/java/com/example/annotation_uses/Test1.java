package com.example.annotation_uses;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.*;

/**
 * @Description: 使用注解@Test、@BeforeClass、@AterClass、@BeforeMethod、@AfterMethod
 * @Author: 黄晓阳
 * @CreateTime: 2019-09-22 10:40
 */
@Slf4j
@Test
public class Test1 {
    @BeforeClass
    public void beforeClass() {
        log.info("beforeClass----------");
    }

    @AfterClass
    public void afterClass() {
        log.info("afterClass----------");
    }

    @BeforeMethod
    public void beforeMethod() {
        log.info("beforeMethod-------");
    }

    @AfterMethod
    public void afterMethod() {
        log.info("afterMethod-------");
    }

    @Test
    public void test1() {
        log.info("test1-----");
    }

    @Test
    public void test2() {
        log.info("test2-----");
    }

}
