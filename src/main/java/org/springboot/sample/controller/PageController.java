package org.springboot.sample.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController implements EnvironmentAware{

    @Override
    public void setEnvironment(Environment environment) {
        String s = environment.getProperty("JAVA_HOME");
        System.out.println(s);
    }

    // 从 application.properties 中读取配置，如取不到默认值为Hello Shanhy
    @Value("${application.hello}")
    private String hello = "Hello Shanhy";

    /**
     * @return
     * @author long
     * @create 2016年10月26日
     */
    @RequestMapping(value = {"/","/index"})
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView("/index");
        mav.addObject("time", new Date().toString());
        mav.addObject("message", this.hello);
        return mav;
    }

    /**
     * @author  qiujianglong
     * @create  2016年10月26日
     */
    @RequestMapping("/welcome")
    public ModelAndView page1(){
        ModelAndView mav = new ModelAndView("/welcome");
        mav.addObject("content", hello);
        return mav;
    }

}