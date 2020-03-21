package com.yifeng.servlet;


import com.yifeng.domain.Course;
import com.yifeng.domain.Teacher;
import com.yifeng.service.CourseService;
import com.yifeng.service.TeacherService;
import com.yifeng.service.impl.CourseServiceImpl;
import com.yifeng.service.impl.TeacherServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 课程列表
 */
@WebServlet("/courseListServlet")
public class CourseListServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");


        CourseService service = new CourseServiceImpl();
        List<Course> courses = service.findAllCourse();
        //System.out.println(students);
//        System.out.println("-------------");
//        System.out.println(teachers);
        request.setAttribute("courses", courses);
        request.getRequestDispatcher("/pages/admin/course-list.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
