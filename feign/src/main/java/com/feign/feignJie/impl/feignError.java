package com.feign.feignJie.impl;

import com.feign.entity.student;
import com.feign.feignJie.feignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
public class feignError implements feignProviderClient {

    @Override
    public Collection<student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中...";
    }
}
