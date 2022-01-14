package com.yds.log5j;

import com.yds.logging.Logger;

/**
 * @Author: yangdingshan
 * @Date: 2022/1/14 15:47
 * @Description:
 */
public class Log5j implements Logger {

    public void info(String msg) {
        System.out.println("log5j-info:" + msg);
    }
}
