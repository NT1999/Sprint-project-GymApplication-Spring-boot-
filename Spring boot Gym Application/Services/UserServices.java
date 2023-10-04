package com.gymwebsite.gym.Services;

import com.gymwebsite.gym.Entities.User;

public interface UserServices {
    User addUser(User user);
    User getUserDetail(int gId);
}
