package com.gatesma.gmail;

import com.gatesma.gmail.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Copyright (C), 2020
 * FileName: MainApplication
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/8 16:34
 * Description:
 */
public class MainApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:consumer.xml");

        OrderService orderService = applicationContext.getBean(OrderService.class);
        orderService.initOrder("1");

        System.in.read();
    }

}
