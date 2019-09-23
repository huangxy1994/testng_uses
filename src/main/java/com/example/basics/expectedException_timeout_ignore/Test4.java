package com.example.basics.expectedException_timeout_ignore;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * @Description: 忽略测试
 * @Author: 黄晓阳
 * @CreateTime: 2019-09-22 19:37
 */
@Slf4j
public class Test4 {

    @Test(enabled = true)
    public void func1() {
        log.info("func1-----");
    }

    @Test(enabled = false)
    public void func2() {
        log.info("func2-----");
    }

    @Test()
    public void func3() {
        log.info("func3-----");
    }
}
