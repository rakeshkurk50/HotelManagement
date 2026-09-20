package com.example.HotelManagement.exception;

public class RoomNotFoundException extends RuntimeException{

    public RoomNotFoundException(String messsage){
        super(messsage);
    }
}
