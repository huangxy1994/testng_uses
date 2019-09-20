/**
 * @Description
 * @Author 黄晓阳
 * @Date 2019-07-02 17:15
 */

package com.example.parameters_uses;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertFalse;

@Slf4j
public class test_func1 {

    @BeforeClass
    public void beforeClass() {
        log.info("------------------beforeClass");
    }

    @AfterClass
    public void afterClass() {
        log.info("------------------afterClass");
    }

    // 定义对象数组
    @DataProvider(name = "add")
    public Object[][] Users() {
        return new Object[][]{
                {"hello", 2}
        };
    }

    // @Parameters({"add"})
    @Test(description = "func1组1接口", dataProvider = "add")
    public void test_1(String parameter1, int parameter2) {
        log.info("------------------test_1");
        System.out.println(parameter1);
        System.out.println(parameter2);
        parameter1 = "helloworld";
        assertFalse(false);
    }

    // @Parameters({"parameter1","parameter2"})
    @Test(description = "func1组2接口", dataProvider = "add")
    public void test_2(String parameter1, int parameter2) {
        log.info("------------------test_2");
        System.out.println(parameter1);
        System.out.println(parameter2);
        assertEquals("1", "2", "response log");
    }

    @Test(description = "func1组3接口")
    public void test_3() {
        log.info("------------------test_3");
        assertTrue(true);
    }
}
