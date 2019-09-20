/**
 * @Description
 * @Author 黄晓阳
 * @Date 2019-07-02 17:15
 */

package com.example.random_context_uses;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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

    @Test(description = "func1组1接口")
    public void test_1_1() {
        log.info("------------------test_1_1");
        assertFalse(false);
    }

    @Test(description = "func1组2接口")
    public void test_1_2() {
        log.info("------------------test_1_2");
        assertEquals("1", "2", "response log");
    }

    @Test(description = "func1组3接口")
    public void test_1_3() {
        log.info("------------------test_1_3");
        assertTrue(true);
    }
}
