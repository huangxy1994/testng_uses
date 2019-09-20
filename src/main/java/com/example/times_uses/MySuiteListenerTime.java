/**
 * @Description
 * @Author 黄晓阳
 * @Date 2019-08-12 22:15
 */

package com.example.times_uses;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MySuiteListenerTime implements ISuiteListener {

    long start = System.currentTimeMillis();
    int i = 0;

    @Override
    public void onStart(ISuite suite) {
        System.out.println("==================onStart");
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("==================onFinish" + i);


        if ((System.currentTimeMillis() - start) < 1000 * 5) {
            i++;
            suite.run();
        } else {
            System.out.println("finished ===");
        }

    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
    }
}
