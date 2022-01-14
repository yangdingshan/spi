package com.yds.logging;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @Author: yangdingshan
 * @Date: 2022/1/14 15:14
 * @Description:
 */
public abstract class LoggerFactory {

    public static Logger getLogger() {
        Logger logger = null;
        ServiceLoader<Logger> load = ServiceLoader.load(Logger.class);
        Iterator<Logger> iterator = load.iterator();
        while (iterator.hasNext()) {
            logger = iterator.next();
        }
        return logger;
    }
}
