package com.gymwebsite.gym.Reposistories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gymwebsite.gym.Entities.Trainer;

public interface TrainerRepository extends JpaRepository<Trainer,Integer>{
    
}
