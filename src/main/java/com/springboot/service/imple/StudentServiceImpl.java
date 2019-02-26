package com.springboot.service.imple;

import com.springboot.mapper.StudentMapper;
import com.springboot.service.StudentService;
import com.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
   @Autowired
   private StudentMapper studentMapper;
    @Override
      public List<Student>getAllStudent(){
        return studentMapper.selectAllStudent();
    }
    @Override
    public int update()
    {
        Student student=new Student();
        student.setStuNo("1");
        student.setStuName("wolson");
        student.setStuAge(20);
        student.setCourseNo("1");
        int update=studentMapper.updateByPrimaryKeySelective(student);
        System.out.println("更新结果"+update);
        return update;

    }
    @Override
    public int add()
    {
        Student student=new Student();
        student.setStuNo("6");
        student.setStuName("douzi");
        student.setStuAge(20);
        student.setCourseNo("1");
        int add=studentMapper.insertSelective(student);
        System.out.println("添加结果"+add);
        return add;
    }
    @Override
    public int delete()
    {
        Student student=new Student();
        int delete=studentMapper.deleteByPrimaryKey("4");
        System.out.println("删除结果"+delete);
        return delete;
    }

}
