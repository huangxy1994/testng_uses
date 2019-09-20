/**
 * @Description
 * @Author 黄晓阳
 * @Date 2019-09-20 13:08
 */

package com.example.times_uses;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
    private int retryCount = 1;
    private static int maxRetryCount = 3;  // 控制失败跑几次

    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}
