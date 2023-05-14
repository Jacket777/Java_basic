package com.slf4j.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloSLF {
    //程序的入口
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(HelloSLF.class);
        logger.trace("trace");
        logger.debug("debug");
        logger.warn("warn");
        logger.error("error");
        logger.info("hello {} {}","test1","test2");
    }

}
