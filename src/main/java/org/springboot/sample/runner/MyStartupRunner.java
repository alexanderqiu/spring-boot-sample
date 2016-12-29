package org.springboot.sample.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 服务启动执行
 *
 * @author long
 * @date 2016/10/27
 */
@Component
public class MyStartupRunner implements CommandLineRunner{

    private static final Logger logger = LoggerFactory.getLogger(MyStartupRunner.class);

   @Override
    public void run(String... args) throws Exception {
        logger.debug("日志测试 DEBUG级别");
        logger.info("日志测试 INFO级别");
        logger.trace("日志测试 TRACE级别");
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作<<<<<<<<<<<<<");
    }

}
