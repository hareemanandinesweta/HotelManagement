  
package com.cg.hotelmanagement.validation;

public class HotelManagementException extends Exception {

    private String hotelException;

    public HotelManagementException(String hotelException){
        super(hotelException);
    }
}