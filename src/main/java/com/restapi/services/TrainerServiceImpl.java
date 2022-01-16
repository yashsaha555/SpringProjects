package com.restapi.services;

import com.restapi.entities.Trainer;
import com.restapi.repositories.TrainerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrainerServiceImpl implements TrainerService{
    @Autowired
    private TrainerRepository trainerRepository;
    @Override
    public List<Trainer> getAllTrainers() {
        return trainerRepository.findAll();
    }

    @Override
    public Trainer getTrainerById(int id) {
        return trainerRepository.getById(id);
    }

    @Override
    public Trainer createTrainer(Trainer trainer) {
        return trainerRepository.saveAndFlush(trainer);
    }

    @Override
    public Trainer updateTrainer(int id, Trainer trainer) {
        Trainer existingTrainer=getTrainerById(id);
        BeanUtils.copyProperties(trainer,existingTrainer,"trainerId");
        return trainerRepository.saveAndFlush(existingTrainer);
    }

    @Override
    public void deleteTrainer(int id) {
        trainerRepository.deleteById(id);
    }
}
