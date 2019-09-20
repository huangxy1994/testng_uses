/**
 * @Description
 * @Author 黄晓阳
 * @Date 2019-08-12 22:05
 */

package com.example.times_uses;

import org.testng.IAlterSuiteListener;
import org.testng.xml.XmlSuite;

import java.util.List;

public class AlterSuiteNameListener implements IAlterSuiteListener {

    @Override
    public void alter(List<XmlSuite> suites) {
        System.out.println("==================================================1");
        XmlSuite suite = suites.get(0);
        suite.setName(getClass().getSimpleName());
        System.out.println("==================================================2");
    }
}

