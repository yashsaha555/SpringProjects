package com.restapi.controllers;

import com.restapi.entities.Course;
import com.restapi.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/getCourses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourse();
    }
    @GetMapping("/getCourse/{id}")
    public Course getCourseById(@PathVariable int id)
    {
        return courseService.getCourseById(id);
    }
    @PostMapping("/postCourse")
    public Course postCourse(@RequestBody Course course)
    {
        return courseService.createCourse(course);
    }
    @PutMapping("/updateCourse/{id}")
    public Course updateCourse(@PathVariable int id, @RequestBody Course course)
    {
        return courseService.updateCourse(id,course);
    }
    @DeleteMapping("/deleteCourse/{id}")
    public void deleteCourse(@PathVariable int id)
    {
        courseService.deleteCourse(id);
    }
}
