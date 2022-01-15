package com.restapi.entities;

import javax.persistence.*;
import java.util.List;
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;
    private String courseName;
    @ManyToMany(mappedBy = "courseList")
    private List<Trainer> trainerList;

    public Course() {

    }

    public Course(String courseName, int courseId, List<Trainer> trainerList) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.trainerList = trainerList;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public List<Trainer> getTrainerList() {
        return trainerList;
    }

    public void setTrainerList(List<Trainer> trainerList) {
        this.trainerList = trainerList;
    }
}
