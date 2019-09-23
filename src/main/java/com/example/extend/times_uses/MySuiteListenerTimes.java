/**
 * @Description
 * @Author 黄晓阳
 * @Date 2019-08-12 22:15
 */

package com.example.extend.times_uses;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MySuiteListenerTimes implements ISuiteListener {

    int i = 0;

    @Override
    public void onStart(ISuite suite) {
        System.out.println("==================onStart");
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("==================onFinish" + i);

        i++;
        if (i < 50) {
            suite.run();
        } else {
            System.out.println("finished ===");
        }
    }
}
