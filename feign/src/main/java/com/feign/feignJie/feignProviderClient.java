package com.feign.feignJie;

import com.feign.entity.student;
import com.feign.feignJie.impl.feignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
@FeignClient(value="provider",fallback = feignError.class)
public interface feignProviderClient {
   @GetMapping("/student/findAll")
    public Collection<student> findAll();
   @GetMapping("/student/index")
    public String index();
}
