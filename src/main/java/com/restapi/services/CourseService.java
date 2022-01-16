package com.restapi.services;

import com.restapi.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getAllCourse();
    public Course getCourseById(int id);
    public Course createCourse(Course course);
    public Course updateCourse(int id, Course course);
    public void deleteCourse(int id);
}

