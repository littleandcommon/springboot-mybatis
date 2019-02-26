package com.springboot.service;
import  com.springboot.model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudent();
    public int update();
    public int add();
    public int delete();
}
