package com.gymwebsite.gym.ServiceImpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gymwebsite.gym.Entities.User;
import com.gymwebsite.gym.Exception.UserNotFoundException;
import com.gymwebsite.gym.Reposistories.UserRepository;
import com.gymwebsite.gym.Services.UserServices;

@Service
public class UserServiceImpl implements UserServices{
    
    @Autowired
    UserRepository uRepo;

    @Override
    public User addUser(User user) {
        return uRepo.save(user);
    }

    @Override
    public User getUserDetail(int gId) {
        return uRepo.findById(gId).orElseThrow(() -> new UserNotFoundException("Entered User Id Not Present"));
    }


}
