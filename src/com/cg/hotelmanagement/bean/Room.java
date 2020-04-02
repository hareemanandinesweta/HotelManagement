package com.cg.hotelmanagement.bean;

import java.util.LinkedList;
import java.util.List;

public class Room {

    private String roomid;
    private String roomtype;
    private String roomCheckIn;
    private String roomCheckOut;
    private String roomcost;
    private List<Booking> bookingDetails = new LinkedList<>();

    public Room(String roomid, String roomtype, String roomCheckIn, String roomCheckOut, String roomcost, List<Booking> bookingDetails) {
        this.roomid = roomid;
        this.roomtype = roomtype;
        this.roomCheckIn = roomCheckIn;
        this.roomCheckOut = roomCheckOut;
        this.roomcost = roomcost;
        this.bookingDetails = bookingDetails;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomid='" + roomid + '\'' +
                ", roomtype='" + roomtype + '\'' +
                ", roomCheckIn='" + roomCheckIn + '\'' +
                ", roomCheckOut='" + roomCheckOut + '\'' +
                ", roomcost='" + roomcost + '\'' +
                ", bookingDetails=" + bookingDetails +
                '}';
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getRoomCheckIn() {
        return roomCheckIn;
    }

    public void setRoomCheckIn(String roomCheckIn) {
        this.roomCheckIn = roomCheckIn;
    }

    public String getRoomCheckOut() {
        return roomCheckOut;
    }

    public void setRoomCheckOut(String roomCheckOut) {
        this.roomCheckOut = roomCheckOut;
    }

    public String getRoomcost() {
        return roomcost;
    }

    public void setRoomcost(String roomcost) {
        this.roomcost = roomcost;
    }

    public List<Booking> getBookingDetails() {
        return bookingDetails;
    }

    public void setBookingDetails(List<Booking> bookingDetails) {
        this.bookingDetails = bookingDetails;
    }
}
