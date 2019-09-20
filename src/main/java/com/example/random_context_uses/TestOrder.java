/**
 * @Description
 * @Author 黄晓阳
 * @Date 2019-07-16 11:23
 */

package com.example.random_context_uses;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import java.util.List;

public class TestOrder implements IMethodInterceptor {
    @Override
    public List<IMethodInstance> intercept(List<IMethodInstance> list, ITestContext iTestContext) {
        long seed = System.nanoTime();
        System.out.println("=====================================11");
        for (IMethodInstance i : list) {
            System.out.println(i.getMethod().getMethodName());
        }
//        Collections.shuffle(list, new Random(seed));
        System.out.println("=====================================12");
        for (IMethodInstance i : list) {
            System.out.println(i.getMethod().getMethodName());
        }
        return list;
    }
}
