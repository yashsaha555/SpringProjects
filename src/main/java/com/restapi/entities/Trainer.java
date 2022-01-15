package com.restapi.entities;

import javax.persistence.*;
import java.util.List;
@Entity
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trainerId;
    private String trainerName;
    @ManyToMany
    private List<Course> courseList;

    public Trainer() {
    }

    public Trainer(String trainerName, int trainerId, List<Course> courseList) {
        this.trainerName = trainerName;
        this.trainerId = trainerId;
        this.courseList = courseList;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainerName='" + trainerName + '\'' +
                ", trainerId=" + trainerId +
                ", courseList=" + courseList +
                '}';
    }
}
