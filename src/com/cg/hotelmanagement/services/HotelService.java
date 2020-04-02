package com.cg.hotelmanagement.services;

import com.cg.hotelmanagement.exceptions.HotelManagementException;

public interface HotelService {

    public boolean addHotel(long hotelId,String hotelType,boolean hotelIsBooked,double hotelCost) throws HotelManagementException;
    public boolean removeHotel(long cityID,long hotelId);



}
