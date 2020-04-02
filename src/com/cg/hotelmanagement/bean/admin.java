package com.cg.hotelmanagement.bean;

public class admin {
    private String adminID;
    private String adminPassword;
    private Hotel hotelDetails;
    private Customer customerDetails;
    private Booking booking;
    private Room room;
    private City city;

    public admin(String adminID, String adminPassword, Hotel hotelDetails, Customer customerDetails, Booking booking, Room room, City city) {
        this.adminID = adminID;
        this.adminPassword = adminPassword;
        this.hotelDetails = hotelDetails;
        this.customerDetails = customerDetails;
        this.booking = booking;
        this.room = room;
        this.city = city;
    }

    public admin(String adminID, String adminPassword) {
        this.adminID = adminID;
        this.adminPassword = adminPassword;
    }

    public admin(Hotel hotelDetails) {
        this.hotelDetails = hotelDetails;
    }

    public admin(Customer customerDetails) {
        this.customerDetails = customerDetails;
    }

    public admin(Booking booking) {
        this.booking = booking;
    }

    public admin(Room room) {
        this.room = room;
    }

    public admin(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "admin{" +
                "adminID='" + adminID + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", hotelDetails=" + hotelDetails +
                ", customerDetails=" + customerDetails +
                ", booking=" + booking +
                ", room=" + room +
                ", city=" + city +
                '}';
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Hotel getHotelDetails() {
        return hotelDetails;
    }

    public void setHotelDetails(Hotel hotelDetails) {
        this.hotelDetails = hotelDetails;
    }

    public Customer getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(Customer customerDetails) {
        this.customerDetails = customerDetails;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
