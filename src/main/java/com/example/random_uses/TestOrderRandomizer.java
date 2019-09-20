/**
 * @Description
 * @Author 黄晓阳
 * @Date 2019-07-16 11:23
 */

package com.example.random_uses;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TestOrderRandomizer implements IMethodInterceptor {
    @Override
    public List<IMethodInstance> intercept(List<IMethodInstance> list, ITestContext iTestContext) {
        long seed = System.nanoTime();
        Collections.shuffle(list, new Random(seed));
        return list;
    }
}
