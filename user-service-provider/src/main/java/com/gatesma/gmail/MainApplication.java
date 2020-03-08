package com.gatesma.gmail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Copyright (C), 2020
 * FileName: MainApplication
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/8 16:24
 * Description:
 */
public class MainApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:provider.xml");
        ioc.start();

        System.in.read();
    }

}
