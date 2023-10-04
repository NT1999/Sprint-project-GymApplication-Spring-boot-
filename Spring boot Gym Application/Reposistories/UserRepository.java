package com.gymwebsite.gym.Reposistories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gymwebsite.gym.Entities.User;

public interface UserRepository extends JpaRepository<User,Integer>{
    
}
