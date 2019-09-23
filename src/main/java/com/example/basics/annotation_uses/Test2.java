package com.example.basics.annotation_uses;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @Description: 使用@BeforeGroups、@AfterGroups
 * @Author: 黄晓阳
 * @CreateTime: 2019-09-22 10:44
 */
@Slf4j
public class Test2 {
    @BeforeGroups("group1")
    public void beforeGroup1() {
        log.info("before group1-------");
    }

    @AfterGroups("group1")
    public void afterGroup1() {
        log.info("after group1-------");
    }

    @BeforeGroups("group2")
    public void beforeGroup2() {
        log.info("before group2-------");
    }

    @AfterGroups("group2")
    public void afterGroup2() {
        log.info("after group2-------");
    }

    @Test(groups = "group1")
    public void g1() {
        log.info("g1-----");
    }

    @Test(groups = "group2")
    public void g2() {
        log.info("g2-----");
    }

    @Test(groups = "group1")
    public void g3() {
        log.info("g3-----");
    }

    @Test(groups = "group2")
    public void g4() {
        log.info("g4-----");
    }
}
