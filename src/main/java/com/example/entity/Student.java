package com.example.entity;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;


@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentId")
    private Integer studentId; // 学生ID，使用整数类型

    @Column(name = "name")
    private String name; // 姓名，使用字符串类型

    @Column(name = "sex")
    private String sex; // 性别，使用字符串类型

    @Column(name = "dateOfBirth")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth; // 出生日期，使用 LocalDate 类型

    @Column(name = "nativePlace")
    private String nativePlace; // 籍贯，使用字符串类型

    @Column(name = "mobilePhone")
    private String mobilePhone; // 手机号，使用字符串类型

    @Column(name = "departmentId")
    private Integer departmentId; // 部门ID，使用整数类型

    @Column(name = "status")
    private String status; // 状态，使用字符串类型

    // 添加 getter 和 setter 方法
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

