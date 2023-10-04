package com.gymwebsite.gym.ServiceImpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gymwebsite.gym.Entities.Trainer;
import com.gymwebsite.gym.Exception.TrainerNotFoundException;
import com.gymwebsite.gym.Reposistories.TrainerRepository;
import com.gymwebsite.gym.Services.TrainerServices;

@Service
public class TrainerServicesimpl implements TrainerServices{

    @Autowired
    TrainerRepository tRepo;

    @Override
    public Trainer getTrainerDetail(int tId) {
        return tRepo.findById(tId).orElseThrow(()-> new TrainerNotFoundException("Trainer Id is Not found"));
    }

    @Override
    public List<Trainer> getAllTrainers() {
        return tRepo.findAll();
    }
    
}
