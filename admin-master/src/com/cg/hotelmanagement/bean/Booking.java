package com.cg.hotelmanagement.bean;

public class Booking {

    private long bookingId;
    private String bookingCheckIn;
    private String bookingCheckOut;
    private City city;
    private Customer customer;

    public Booking(long bookingId, String bookingCheckIn, String bookingCheckOut, City city, Customer customer) {
        this.bookingId = bookingId;
        this.bookingCheckIn = bookingCheckIn;
        this.bookingCheckOut = bookingCheckOut;
        this.city = city;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", bookingCheckIn='" + bookingCheckIn + '\'' +
                ", bookingCheckOut='" + bookingCheckOut + '\'' +
                ", city=" + city +
                ", customer=" + customer +
                '}';
    }

    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingCheckIn() {
        return bookingCheckIn;
    }

    public void setBookingCheckIn(String bookingCheckIn) {
        this.bookingCheckIn = bookingCheckIn;
    }

    public String getBookingCheckOut() {
        return bookingCheckOut;
    }

    public void setBookingCheckOut(String bookingCheckOut) {
        this.bookingCheckOut = bookingCheckOut;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
