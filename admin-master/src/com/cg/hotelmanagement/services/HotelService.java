package com.cg.hotelmanagement.services;

import com.cg.hotelmanagement.bean.*;
import com.cg.hotelmanagement.exceptions.HotelManagementException;

import java.util.List;

public interface HotelService {

    public boolean addHotel(Hotel hotel) throws HotelManagementException;
    public boolean removeHotel(City city,Hotel hotel);

    public boolean addRoom(Room room) throws HotelManagementException;
    public boolean removeRoom(Long cityId,Long hotelId,Long roomId);

    public boolean addCity(City city) throws HotelManagementException;
    public boolean removeCity(City city);

    public List<City> showCity();
    public List<Hotel> showHotel(long cityId) throws HotelManagementException;
    public List<Room> showRoom(String cityId, String hotelId);

    public void makeBooking(Booking booking);
    public void register(Customer customer) throws HotelManagementException;


}
