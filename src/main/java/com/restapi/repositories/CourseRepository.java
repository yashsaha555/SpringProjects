package com.restapi.repositories;

import com.restapi.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CourseRepository extends JpaRepository<Course,Integer> {
}
