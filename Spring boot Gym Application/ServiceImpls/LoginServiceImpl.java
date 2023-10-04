package com.gymwebsite.gym.ServiceImpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gymwebsite.gym.Entities.Login;
import com.gymwebsite.gym.Reposistories.LoginRepository;
import com.gymwebsite.gym.Services.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
    
    @Autowired
    LoginRepository lRepo;

    @Override
    public Login loginUser(String userName, String password) {
        Login login = lRepo.findByUserNameAndPassword(userName, password);
        return login;
    }


}
