package org.springboot.sample;

import org.apache.activemq.command.ActiveMQQueue;
import org.springboot.sample.servlet.MyServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.jms.Queue;

/**
 * Created by long on 2016/10/26.
 */
@ServletComponentScan
public class SpringBootSampleApplication {

//    /**
//     * 使用代码注册Servlet（不需要@ServletComponentScan注解）
//     *
//     * @author long
//     * @date  2016年10月26日
//     */
//    @Bean
//    public ServletRegistrationBean servletRegistrationBean() {
//
//        // ServletName默认值为首字母小写，即myServlet
//        return new ServletRegistrationBean(new MyServlet(), "/servlet/*");
//
//    }

    @Bean
    public Queue queue() {
        return new ActiveMQQueue("sample.queue");
    }

    public static void main(String[] args) {

        SpringApplication.run(SpringBootSampleApplication.class, args);

    }

}
