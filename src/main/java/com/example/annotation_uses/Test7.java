package com.example.annotation_uses;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 使用@Factory
 * @Author: 黄晓阳
 * @CreateTime: 2019-09-22 16:28
 */
@Slf4j
public class Test7 {
    private String host;
    private int port;

    public Test7(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Test
    public void login() {
        System.out.println("login, host:" + host + ";port" + port);
    }

    @Test(dependsOnMethods = "login")
    public void logout() {
        System.out.println("logout, host:" + host + ";port" + port);
    }

    @Factory
    public static Object[] create() {
        List<Test7> list = new ArrayList<Test7>();
        list.add(new Test7("127.0.0.1", 8080));
        list.add(new Test7("127.0.0.2", 8080));
        return list.toArray();
    }
}
