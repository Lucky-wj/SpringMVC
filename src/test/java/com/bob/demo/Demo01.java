package com.bob.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author WangJun
 * @since 2020/6/22
 */
public class Demo01 {
    public static Logger logger = LoggerFactory.getLogger(Demo01.class);

    public static void main(String[] args) {

        int size = 100;

        for (int i = 0; i < size; i++) {

            logger.info("---------------------------------------");
            logger.info("---------------------------------------");
            logger.info("---------------------------------------");
            logger.info("---------------------------------------");
            logger.info("---------------------------------------");
            logger.info("---------------------------------------");
            logger.info("---------------------------------------");
        }

    }
}
