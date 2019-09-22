package com.example.expectedException_timeout_ignore;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * @Description: 超时测试
 * @Author: 黄晓阳
 * @CreateTime: 2019-09-22 19:29
 */
@Slf4j
public class Test3 {

    @Test(timeOut = 3000)
    public void func1() {
        try {
            Thread.sleep(3001);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("func1-----");
    }

    @Test(timeOut = 3000)
    public void func2() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("func2-----");
    }
}
