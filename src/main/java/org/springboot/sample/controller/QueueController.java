package org.springboot.sample.controller;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

/**
 * @author long
 * @date 2016/12/15
 */
@RestController
@RequestMapping("/queue")
public class QueueController {

    @RequestMapping("/queueStart")
    public Queue queueStart() {
        return new ActiveMQQueue("sample.queue");
    }

}
