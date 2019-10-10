package com.hystrix.controller;

import com.hystrix.entity.student;
import com.hystrix.feignJie.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class hystrixHandle {
   @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<student> findAll(){
       return feignProviderClient.findAll();
    }
    @GetMapping("/index")
    public String index(){
        return  feignProviderClient.index();
    }

}
