package com.example.dao;

import com.example.entity.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
@Repository
public interface StudentDao extends Mapper<Student> {

    @Select("select * from student")
    List<Student> getStudent();
}
