package com.gymwebsite.gym.Reposistories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gymwebsite.gym.Entities.Login;

public interface LoginRepository extends JpaRepository<Login,Integer>{
    public Login findByUserNameAndPassword(String userName,String password);
}
