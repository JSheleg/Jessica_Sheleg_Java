package com.company.M2ChallengeShelegJessica.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(){
        super();
    }

    public NotFoundException(String msg){
        super(msg);
    }
}
