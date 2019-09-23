package com.example.basics.group_uses;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * @Description: 分组测试-在类上分组
 * @Author: 黄晓阳
 * @CreateTime: 2019-09-22 23:26
 */
@Slf4j
@Test(groups = {"group4", "group5"})
public class Test3 {
    @Test
    public void func1() {
        log.info("Test3 -- func1");
    }

    @Test
    public void func2() {
        log.info("Test4 -- func2");
    }
}
