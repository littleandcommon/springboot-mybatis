package com.springboot.mapper;

import com.springboot.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    int deleteByPrimaryKey(String stuNo);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String stuNo);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> selectAllStudent();
}