package com.gatesma.gmail.service.impl;

import com.gatesma.gmail.bean.UserAddress;
import com.gatesma.gmail.service.UserService;
import org.jboss.netty.util.internal.StringUtil;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Copyright (C), 2020
 * FileName: UserServiceStub
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/9 11:18
 * Description:
 */
public class UserServiceStub implements UserService {

    private final UserService userService;

    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("本地存根调用");
        if(!StringUtils.isEmpty(userId)) {
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
