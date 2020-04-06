package com.cg.hotelmanagement.bean;

import java.util.LinkedList;
import java.util.List;

public class Hotel {

    private long hotelId;
    private String hotelName;
    private String hotelType;
    private String hotelAddress;
    private String hotelPhoneNo;
    private String hotelRating;
    private List<Room> roomList = new LinkedList<>();

    public Hotel(){

    }

    public Hotel(long hotelId, String hotelName, String hotelType, String hotelAddress, String hotelPhoneNo, String hotelRating) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelType = hotelType;
        this.hotelAddress = hotelAddress;
        this.hotelPhoneNo = hotelPhoneNo;
        this.hotelRating = hotelRating;
    }

    public Hotel(long hotelId, String hotelName, String hotelType, String hotelAddress, String hotelPhoneNo, String hotelRating, List<Room> roomList) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelType = hotelType;
        this.hotelAddress = hotelAddress;
        this.hotelPhoneNo = hotelPhoneNo;
        this.hotelRating = hotelRating;
        this.roomList = roomList;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId='" + hotelId + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", hotelType='" + hotelType + '\'' +
                ", hotelAddress='" + hotelAddress + '\'' +
                ", hotelPhoneNo='" + hotelPhoneNo + '\'' +
                ", hotelRating='" + hotelRating + '\'' +
                ", roomList=" + roomList +
                '}';
    }

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        this.hotelType = hotelType;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getHotelPhoneNo() {
        return hotelPhoneNo;
    }

    public void setHotelPhoneNo(String hotelPhoneNo) {
        this.hotelPhoneNo = hotelPhoneNo;
    }

    public String getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(String hotelRating) {
        this.hotelRating = hotelRating;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }
}