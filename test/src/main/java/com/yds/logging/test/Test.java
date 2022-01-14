package com.yds.logging.test;

import com.yds.logging.Logger;
import com.yds.logging.LoggerFactory;

/**
 * @Author: yangdingshan
 * @Date: 2022/1/14 15:20
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger();
        logger.info("这是输入日志呀");
    }
}
