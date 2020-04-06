package com.cg.hotelmanagement.exception;

public class HotelManagementException extends Exception {

    private String hotelException;

    public HotelManagementException(String hotelException)
    {
        super(hotelException);
    }
}