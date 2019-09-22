package com.example.expected_exception_uses;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * @Description: 预期异常测试-自定义异常
 * @Author: 黄晓阳
 * @CreateTime: 2019-09-22 18:53
 */
@Slf4j
public class Test2 {

    class WrongInputException extends Exception {  // 自定义的类
        WrongInputException(String s) {
            super(s);
        }
    }

    public void ex(String e) throws WrongInputException {
        if ("exception".equals(e)) {
            throw new WrongInputException("wrong input");
        } else {
            log.info(e);
        }
    }

    @Test(expectedExceptions = WrongInputException.class)
    public void func1() throws WrongInputException {
        ex("exception");
    }

    @Test(expectedExceptions = WrongInputException.class)
    public void func2() throws WrongInputException {
        ex("normal");
    }
}
