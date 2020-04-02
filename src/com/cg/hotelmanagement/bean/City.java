package com.cg.hotelmanagement.bean;

import java.util.LinkedList;
import java.util.List;

public class City {

    private String cityId;
    private String cityName;
    private List<Hotel> hotelList = new LinkedList<Hotel>();

    public City(String cityId, String cityName, List<Hotel> hotelList) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.hotelList = hotelList;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId='" + cityId + '\'' +
                ", cityName='" + cityName + '\'' +
                ", hotelList=" + hotelList +
                '}';
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<Hotel> getHotelList() {
        return hotelList;
    }

    public void setHotelList(List<Hotel> hotelList) {
        this.hotelList = hotelList;
    }
}
