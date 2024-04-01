package com.example.service;

import com.example.entity.Student;
import com.example.dao.StudentDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentService {
    @Resource
    private StudentDao studentDao;

    public List<Student> getStudent(){
        return studentDao.getStudent();
    }
}
