package com.hystrix.feignJie;


import com.hystrix.entity.student;
import com.hystrix.feignJie.impl.feignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value="provider",fallback = feignError.class)
public interface FeignProviderClient {
   @GetMapping("/student/findAll")
    public Collection<student> findAll();
   @GetMapping("/student/index")
    public String index();
}
