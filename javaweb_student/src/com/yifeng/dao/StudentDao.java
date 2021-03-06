package com.yifeng.dao;

import com.yifeng.domain.Scourse;
import com.yifeng.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAllStudent();

    void addStudent(Student student);

    void delStudentById(String id);

    Student selStudentById(String id);

    void updateStudent(Student student);

    void inSelectedCourse(String userId, int id);

    List<Scourse> findSelectStudent(Integer id);
}
