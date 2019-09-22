package com.example.expectedException_timeout_ignore;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * @Description: 预期异常测试-运行时异常
 * @Author: 黄晓阳
 * @CreateTime: 2019-09-22 18:53
 */
@Slf4j
public class Test1 {
    @Test(expectedExceptions = ArithmeticException.class)
    public void func1() {
        log.info("before func1-----");
        int i = 1 / 0;
        log.info("after func1-----");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void func2() {
        log.info("before func2-----");
        int i = 1 / 1;
        log.info("after func2-----");
    }
}
