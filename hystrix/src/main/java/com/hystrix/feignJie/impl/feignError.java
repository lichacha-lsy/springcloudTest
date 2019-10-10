package com.hystrix.feignJie.impl;


import com.hystrix.entity.student;
import com.hystrix.feignJie.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class feignError implements FeignProviderClient {

    @Override
    public Collection<student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中...";
    }
}
