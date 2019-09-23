/**
 * @Description
 * @Author 黄晓阳
 * @Date 2019-07-22 17:44
 */

package com.example.extend.thread_uses;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class SetThreadCount implements IAnnotationTransformer {

    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
//        if ("BeginGetPV".equals(testMethod.getName())) {
//            String relativelyPath = System.getProperty("user.dir");
//            File driverConfig = new File(relativelyPath, "config");
//            driverConfig = new File(driverConfig, "config.properties");
//
//            if (!driverConfig.exists()) {
//                return;
//            }
//
////            // 声明驱动路径
////            PropertiesConfiguration.PropertiesReader config = new PropertiesConfiguration.PropertiesReader(driverConfig.getAbsolutePath());
////            String totalAmount = config.getProperties("totalAmount");
////            if (StringUtils.isNotEmpty(totalAmount)) {
////                annotation.setInvocationCount(Integer.parseInt(totalAmount));
////            }
////            String threadCount = config.getProperties("threadCount");
////            if (StringUtils.isNotEmpty(threadCount)) {
////                annotation.setThreadPoolSize(Integer.parseInt(threadCount));
////            }
//
//            annotation.setInvocationCount(100);
//            annotation.setThreadPoolSize(2);
//        }
        annotation.setInvocationCount(100);
        annotation.setThreadPoolSize(50);
    }
}
