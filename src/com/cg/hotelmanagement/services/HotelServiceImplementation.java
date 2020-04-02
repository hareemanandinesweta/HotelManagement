package com.cg.hotelmanagement.services;

import com.cg.hotelmanagement.bean.*;
import com.cg.hotelmanagement.exceptions.HotelManagementException;

import java.util.List;

public class HotelServiceImplementation implements HotelService {



    @Override
    public boolean addHotel(String hotelId, String hotelName, String hotelType, String hotelAddress, String hotelPhoneNo, String hotelRating, boolean hotelIsBooked, List<Room> roomList) throws HotelManagementException {
        return false;
    }

    @Override
    public boolean removeHotel(String cityID, String hotelId) {
        return false;
    }

    @Override
    public boolean addRoom(Long roomId, String roomtype, String roomCheckIn, String roomCheckOut, String roomcost, List<Booking> bookingDetails) throws HotelManagementException {
        return false;
    }

    @Override
    public boolean removeRoom(Long cityId, Long hotelId, Long roomId) {
        return false;
    }

    @Override
    public boolean addCity(String cityId, String cityName, List<Hotel> hotelList) throws HotelManagementException {
        return false;
    }

    @Override
    public boolean removeCity(String cityId) {
        return false;
    }

    @Override
    public List<City> showCity() {
        return null;
    }

    @Override
    public List<Hotel> showHotel(String cityId) throws HotelManagementException {
        return null;
    }

    @Override
    public List<Room> showRoom(String cityId, String hotelId) {
        return null;
    }

    @Override
    public void makeBooking(String cityId, String hotelId, String bookingId, String bookingCheckIn, String bookingCheckOut, String roomId, String customerId) {

    }

    @Override
    public void register(Customer customer) throws HotelManagementException {

    }
}
