//后台接口的入口，前端操作数据会调用后端的接口，前后台交互的入口
package com.example.controller;

import com.example.common.Result;
import com.example.entity.Student;
import com.example.service.StudentService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @GetMapping()
    public Result getStudent() {
        List<Student> list = studentService.getStudent();
        return Result.success(list);

    }
}