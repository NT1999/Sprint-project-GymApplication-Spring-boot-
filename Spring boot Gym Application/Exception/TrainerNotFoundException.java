package com.gymwebsite.gym.Exception;

public class TrainerNotFoundException extends RuntimeException{
    public TrainerNotFoundException(String message){
        super(message);
    }
}
