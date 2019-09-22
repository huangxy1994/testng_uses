package com.example.annotation_uses;

import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Description: 使用@DataProvider
 * @Author: 黄晓阳
 * @CreateTime: 2019-09-22 11:56
 */
@Slf4j
public class Test6 {

    @DataProvider(name = "testData")
    private Object[][] dataProvider() {
        return new Object[][]{{10, 30}, {100, 110}, {200, 210}};
    }

    @Test(dataProvider = "testData")
    public void fun1(int a, int b) {
        Assert.assertEquals(a + 10, b);
    }

}
