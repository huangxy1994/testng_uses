/**
 * @Description
 * @Author 黄晓阳
 * @Date 2019-07-16 11:23
 */

package com.example.random_context_uses;

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
        System.out.println("=====================================1");
        for (IMethodInstance i : list) {
            System.out.println(i.getMethod().getMethodName());
            System.out.println(i.getInstance().getClass().getName());
        }
        Collections.shuffle(list, new Random(seed));
        System.out.println("=====================================2");
        for (IMethodInstance i : list) {
            System.out.println(i.getMethod().getMethodName());
        }
        return list;
    }
}
