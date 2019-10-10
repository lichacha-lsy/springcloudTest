package com.client.comtroller;

import com.client.entity.student;
import com.client.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class studentHandler {
    @Value("${server.port}")
    private String port;
@Autowired
    private StudentRepository studentRepository;
@GetMapping("/findAll")
    public Collection<student> findAll(){
    return  studentRepository.findAll();
}
@GetMapping("/findById/{id}")
    public student findbyId(@PathVariable("id") long id){
    return studentRepository.findById(id);
}
@PostMapping("/save")
    public void save(@RequestBody student student){
    studentRepository.averOrUpdate(student);
}
@PutMapping("/update")
    public void update(@RequestBody student student){
    studentRepository.averOrUpdate(student);
}
@DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
    studentRepository.deleteById(id);
}
    @GetMapping("/index")
    public String index(){
        return "当前端口："+this.port;}
}

