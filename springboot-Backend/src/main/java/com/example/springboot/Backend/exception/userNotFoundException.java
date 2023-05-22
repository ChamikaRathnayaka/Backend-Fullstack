package com.example.springboot.Backend.exception;

public class userNotFoundException extends RuntimeException  {

    public userNotFoundException(Long id){
    super("could not found the user with id "+ id);
}
    }
