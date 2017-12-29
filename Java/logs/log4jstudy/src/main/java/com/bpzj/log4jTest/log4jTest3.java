package com.bpzj.log4jTest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class log4jTest3 {

    static Logger logger = Logger.getLogger(log4jTest2.class);

    public static void main(String[] args) {

        //指定配置文件
        PropertyConfigurator.configure("E:\\OneDrive\\Code - java\\Task1\\log4jTest\\src\\main\\resources\\log4j.xml");
        for (int i=0;i<20; i++) {
            logger.trace("跟踪信息");
            logger.debug("调试信息");
            logger.info("输出信息");
            logger.warn("警告信息");
            logger.error("错误信息");
            logger.fatal("致命信息");
        }

    }

}