package com.cg.hotelmanagement.bean;

import java.util.ArrayList;
import java.util.Objects;

public class City {

    private long cityId;
    private String cityName;
    private ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

    public City(){

    }


    public City(long cityId, String cityName, ArrayList<Hotel> hotelList) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.hotelList = hotelList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return cityId == city.cityId &&
                cityName.equals(city.cityName) &&
                hotelList.equals(city.hotelList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityId, cityName, hotelList);
    }

    public City(long cityId) {
        this.cityId = cityId;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId='" + cityId + '\'' +
                ", cityName='" + cityName +
                '}';
    }

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<Hotel> getHotelList() {
        return hotelList;
    }

    public void setHotelList(ArrayList<Hotel> hotelList) {
        this.hotelList = hotelList;
    }
}
