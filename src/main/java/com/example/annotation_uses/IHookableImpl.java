package com.example.annotation_uses;

import lombok.extern.slf4j.Slf4j;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

/**
 * @Description:
 * @Author: 黄晓阳
 * @CreateTime: 2019-09-22 18:31
 */
@Slf4j
public class IHookableImpl implements IHookable {
    @Override
    public void run(IHookCallBack callBack, ITestResult testResult) {
        log.info("test method name：" + testResult.getMethod().getMethodName());
        callBack.runTestMethod(testResult);
    }
}
