package com.example.annotation_uses;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @Description: 使用@Listeners
 * @Author: 黄晓阳
 * @CreateTime: 2019-09-22 18:33
 */
@Listeners(IHookableImpl.class)
@Slf4j
public class Test9 {

    @Test
    public void func() {
        log.info("func-----");
    }

}
