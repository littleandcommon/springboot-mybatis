package com.springboot.controller;

import com.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MybatisController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/boot/students")
    public Object students(){
        return studentService.getAllStudent();
    }

    @GetMapping("/boot/update")
    public Object update(){
        return studentService.update();
    }
    @GetMapping("/boot/add")
    public Object add(){
        return studentService.add();
    }
    @GetMapping("/boot/delete")
    public Object delete(){
        return studentService.delete();
    }
}
