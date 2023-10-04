package com.gymwebsite.gym.Services;


import java.util.List;
import com.gymwebsite.gym.Entities.Trainer;

public interface TrainerServices {
    
    Trainer getTrainerDetail(int tId);

    List<Trainer> getAllTrainers();
}
