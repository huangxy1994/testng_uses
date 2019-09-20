/**
 * @Description 依赖单个分组
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
public class test_func2 {

    @BeforeClass
    public void beforeClass() {
        log.info("------------------beforeClass");
    }

    @AfterClass
    public void afterClass() {
        log.info("------------------afterClass");
    }

    @Test(description = "func2组1接口", dependsOnGroups = "group1")
    public void test_1() {
        log.info("------------------test_1");
        assertFalse(false);
    }

    @Test(description = "func2组2接口", groups = "group1")
    public void test_2() {
        log.info("------------------test_2");
        assertEquals("difference message", "1", "1");
    }

    @Test(description = "func2组3接口", groups = "group1")
    public void test_3() {
        log.info("------------------test_3");
        assertTrue(true);
    }
}
