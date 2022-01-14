package com.yds.logging;

/**
 * @Author: yangdingshan
 * @Date: 2022/1/14 15:13
 * @Description:
 */
public class Logback implements Logger {


    @Override
    public void info(String msg) {
        System.out.println("logging-info:" + msg);
    }
}
