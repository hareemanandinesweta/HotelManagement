package com.cg.hotelmanagement.services;

import com.cg.hotelmanagement.bean.*;
import com.cg.hotelmanagement.exceptions.HotelManagementException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HotelServiceImplementation implements HotelService {


    ArrayList<City> cityList = new ArrayList<>();


    @Override
    public boolean addCity(City city) throws HotelManagementException {
       return cityList.add(city);
    }

    @Override
    public boolean removeCity(City city) {
       return cityList.remove(city);
    }

    ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

    @Override
    public boolean addHotel(Hotel hotel) throws HotelManagementException {

        return hotelList.add(hotel);
    }

    @Override
    public boolean removeHotel(String cityID, String hotelId) {

        boolean exists = cityList.contains(cityID);
        if(exists) {
            return hotelList.remove(hotelId);
        }else
            return false;
    }

    List<Room> roomList = new LinkedList<Room>();

    @Override
    public boolean addRoom(Room room) throws HotelManagementException {
        return roomList.add(room);
    }

    @Override
    public boolean removeRoom(Long cityId, Long hotelId, Long roomId) {
        return false;
    }


    @Override
    public ArrayList<City> showCity() {
        for(int i = 0; i< cityList.size(); i++){
            cityList.get(i);
        }
        return cityList;
    }



    @Override
    public List<Hotel> showHotel(long cityId) throws HotelManagementException {
        for(int i = 0; i< hotelList.size(); i++){
            hotelList.get(i);
        }
        return hotelList;
    }

    @Override
    public List<Room> showRoom(String cityId, String hotelId) {
        return null;
    }

    @Override
    public void makeBooking(Booking booking) {

    }

    @Override
    public void register(Customer customer) throws HotelManagementException {

    }
}
