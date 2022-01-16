package com.restapi.services;

import com.restapi.entities.Course;
import com.restapi.repositories.CourseRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(int id) {
        return courseRepository.findById(id).get();
    }

    @Override
    public Course createCourse(Course course) {
        return courseRepository.saveAndFlush(course);
    }

    @Override
    public Course updateCourse(int id, Course course) {
        Course existingCourse = getCourseById(id);
        BeanUtils.copyProperties(course,existingCourse,"courseId");
        return courseRepository.saveAndFlush(existingCourse);
    }

    @Override
    public void deleteCourse(int id) {
        courseRepository.deleteById(id);
    }
}
