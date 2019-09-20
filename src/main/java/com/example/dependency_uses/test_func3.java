/**
 * @Description 依赖多个方法
 * @Author 黄晓阳
 * @Date 2019-07-02 17:15
 */

package com.example.dependency_uses;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertFalse;

@Slf4j
public class test_func3 {

    @BeforeClass
    public void beforeClass() {
        log.info("------------------beforeClass");
    }

    @AfterClass
    public void afterClass() {
        log.info("------------------afterClass");
    }

    @Test(description = "func3组1接口", dependsOnMethods = {"test_2", "test_4"})
    public void test_1() {
        log.info("------------------test_1");
        assertFalse(false);
    }

    @Test(description = "func3组2接口")
    public void test_2() {
        log.info("------------------test_2");
        assertEquals("difference message", "1", "2");
    }

    @Test(description = "func3组3接口")
    public void test_3() {
        log.info("------------------test_3");
        assertTrue(true);
    }

    @Test(description = "func3组4接口")
    public void test_4() {
        log.info("------------------test_4");
        assertTrue(true);
    }
}
