/**
 * @Description
 * @Author 黄晓阳
 * @Date 2019-07-02 20:07
 */

package com.example.extend.random_uses;


import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

/**
 * 状态监听器
 */
public class StateListener implements IHookable {

    @Override
    public void run(IHookCallBack iHookCallBack, ITestResult iTestResult) {

        if ("test_1_1_1".equals(iTestResult.getMethod().getMethodName())) {
            iTestResult.setStatus(ITestResult.SKIP);
        } else {
            iHookCallBack.runTestMethod(iTestResult);
        }
    }

}
