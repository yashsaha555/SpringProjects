package com.restapi.controllers;

import com.restapi.entities.Course;
import com.restapi.entities.Trainer;
import com.restapi.services.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainer")
public class TrainerController {
    @Autowired
    private TrainerService trainerService;
    public List<Trainer> getAllTrainers()
    {
        return trainerService.getAllTrainers();
    }
    @GetMapping("/getTrainer/{id}")
    public Trainer getTrainerById(@PathVariable int id)
    {
        return trainerService.getTrainerById(id);
    }
    @PostMapping("/postTrainer")
    public Trainer postTrainer(@RequestBody Trainer trainer)
    {
        return trainerService.createTrainer(trainer);
    }
    @PutMapping("/updateTrainer/{id}")
    public Trainer updateTrainer(@PathVariable int id, @RequestBody Trainer trainer)
    {
        return trainerService.updateTrainer(id,trainer);
    }
    @DeleteMapping("/deleteTrainer/{id}")
    public void deleteTrainer(@PathVariable int id)
    {
        trainerService.deleteTrainer(id);
    }
}
