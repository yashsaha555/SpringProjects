package com.restapi.services;

import com.restapi.entities.Trainer;

import java.util.List;

public interface TrainerService {
    public List<Trainer> getAllTrainers();
    public Trainer getTrainerById(int id);
    public Trainer createTrainer(Trainer trainer);
    public Trainer updateTrainer(int id, Trainer trainer);
    public void deleteTrainer(int id);
}
