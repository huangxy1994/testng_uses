package com.example.basics.group_uses;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * @Description: 分组测试-在方法上分组
 * @Author: 黄晓阳
 * @CreateTime: 2019-09-22 19:48
 */
@Slf4j
public class Test1 {

    @Test(groups = "group1")
    public void func1() {
        log.info("Test1 -- func1");
    }

    @Test(groups = {"group2"})
    public void func2() {
        log.info("Test1 -- func2");
    }

    @Test(groups = {"group1", "group3"})
    public void func3() {
        log.info("Test1 -- func3");
    }

    @Test(groups = "group3")
    public void func4() {
        log.info("Test1 -- func4");
    }

}
