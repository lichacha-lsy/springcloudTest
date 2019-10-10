package com.feign.controller;

import com.feign.entity.student;
import com.feign.feignJie.feignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class feignHandle {
    @Autowired
    private feignProviderClient feignProviderClient;
   @GetMapping("findAll")
    public Collection<student> findAll(){
   return feignProviderClient.findAll();
    }
 @GetMapping("/index")
    public String index(){
       return feignProviderClient.index();
 }
}
