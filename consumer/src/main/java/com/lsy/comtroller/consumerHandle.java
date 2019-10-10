package com.lsy.comtroller;

import com.lsy.entity.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/consumer")
public class consumerHandle {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<student> findAll(){
        return  restTemplate.getForEntity("http://localhost:8010/student/findAll",Collection.class).getBody();
    }
    @GetMapping("/findAll2")
    public Collection<student> findAll2(){
        return  restTemplate.getForObject("http://localhost:8010/student/findAll",Collection.class);
    }
    @GetMapping("/findById/{id}")
    public student findById(@PathVariable("id") long id){
        return  restTemplate.getForEntity("http://localhost:8010/student/findById/{id}",student.class,id).getBody();

    }
    @GetMapping("/findById2/{id}")
    public student findById2(@PathVariable("id") long id){
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}",student.class,id);
    }
    @PostMapping("/save")
    public void save(student student){
        restTemplate.postForEntity("http://localhost:8010/student/save",student,null).getBody();
    }
    @PostMapping("/save2")
    public void save2(student student){
        restTemplate.postForObject("http://localhost:8010/student/save",student,null);
    }
    @PutMapping("/update")
    public void update(@RequestBody student student){
        restTemplate.put("http://localhost:8010/studnet/update",student);
    }
    @DeleteMapping("/deleteById/{id}")
    public void delete(@PathVariable("id")long id){
        restTemplate.delete("http://localhost:8010/student/deleteById/{id}",id);
    }
}
