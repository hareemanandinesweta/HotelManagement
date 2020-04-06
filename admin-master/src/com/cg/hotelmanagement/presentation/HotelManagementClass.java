package com.cg.hotelmanagement.presentation;

import com.cg.hotelmanagement.bean.City;
import com.cg.hotelmanagement.bean.Hotel;
import com.cg.hotelmanagement.services.HotelServiceImplementation;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelManagementClass {


    public static HotelServiceImplementation hsi = new HotelServiceImplementation();

    public static Scanner scan = new Scanner(System.in);

    static ArrayList<Hotel> HotelList1 = new ArrayList<>();   //list of hotels for pune

    static Hotel hotel11 = new Hotel(1, "MoonLight Hotel", "Luxury", "Pune", "012-234567", "4.0");
    static Hotel hotel12 = new Hotel(2, "SunLight Hotel", "Basic", "Pune", "012-234567", "5.0");
    static Hotel hotel13 = new Hotel(3, "SunShine Hotel", "Semi Luxury", "Pune", "012-234567", "3.5");


    static ArrayList<Hotel> HotelList2 = new ArrayList<>();     //list of hotels for mumbai

    static Hotel hotel21 = new Hotel(1, "MoonLight Hotel", "Luxury", "Mumbai", "012-234567", "4.0");
    static Hotel hotel22 = new Hotel(2, "SunLight Hotel", "Basic", "Mumbai", "012-234567", "5.0");
    static Hotel hotel23 = new Hotel(3, "SunShine Hotel", "Semi Luxury", "Mumbai", "012-234567", "3.5");


    static ArrayList<Hotel> HotelList3 = new ArrayList<>();      //list of hotels for kolkata

    static Hotel hotel31 = new Hotel(1, "MoonLight Hotel", "Luxury", "Kolkata", "012-234567", "4.0");
    static Hotel hotel32 = new Hotel(2, "SunLight Hotel", "Basic", "Kolkata", "012-234567", "5.0");
    static Hotel hotel33 = new Hotel(3, "SunShine Hotel", "Semi Luxury", "Kolkata", "012-234567", "3.5");


    public void setHotelList(ArrayList<Hotel> hotelList) {
        HotelList1.add(hotel11);
        HotelList1.add(hotel12);
        HotelList1.add(hotel13);

        HotelList2.add(hotel21);
        HotelList2.add(hotel22);
        HotelList3.add(hotel23);

        HotelList3.add(hotel31);
        HotelList3.add(hotel32);
        HotelList3.add(hotel33);
    }

    static City city1 = new City(1,"Pune",HotelList1);
    static City city2 = new City(2,"Mumbai",HotelList2);
    static City city3 = new City(3,"Kolkata",HotelList3);

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    printInstructions();
                    break;
                case 2:
                    addCity();
                    break;
                case 3:
                    removeCity();
                    break;
                case 4:
                    System.out.println("Enter the City ID to add a hotel : ");
                    int cityId = scan.nextInt();
                    switch(cityId){
                        case 1:
                            addHotel(cityId);
                            System.out.println("One hotel added.");
                            break;
                        case 2:
                            addHotel(cityId);
                            System.out.println("One hotel added.");
                            break;
                        case 3:
                            addHotel(cityId);
                            System.out.println("One hotel added.");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Enter the City ID : ");
                    cityId = scan.nextInt();
                    switch(cityId){
                        case 1:
                            removeHotel(cityId);
                            System.out.println("One Hotel removed.");
                            break;
                        case 2:
                            removeHotel(cityId);
                            System.out.println("One Hotel removed.");
                            break;
                        case 3:
                            removeHotel(cityId);
                            System.out.println("One Hotel removed.");
                            break;
                    }
                    break;
                case 6:
                    addRoom();
                    break;
                case 7:
                    removeRoom();
                    break;
                case 8:
                    System.out.println(hsi.showCity());
                    break;
                case 9:
                    System.out.println("Enter the city ID");
                    cityId = scan.nextInt();
                    try {

                        switch (cityId) {
                            case 1:
                                System.out.println(hsi.showHotel(cityId));
                                break;
                            case 2:
                                System.out.println(hsi.showHotel(cityId));
                                break;
                            case 3:
                                System.out.println(hsi.showHotel(cityId));
                                break;
                        }

                    } catch (Exception e) {
                        System.out.println("Enter a valid  city ID");
                    }
                    break;
                case 10:

                    break;
                case 11:

                    break;
                case 12:

                    break;
                case 13:
                    quit = true;
                    break;
            }
        }
    }

    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 1 - To list options.");
        System.out.println("\t 2 - To add new location.");
        System.out.println("\t 3 - To remove added location.");

        System.out.println("\t 4 - To add new hotels.");
        System.out.println("\t 5 - To remove added hotels .");

        System.out.println("\t 6 - To add new rooms.");
        System.out.println("\t 7 - To remove added rooms.");

        System.out.println("\t 8 - To display list of loactions.");
        System.out.println("\t 9 - To display list of hotels in location.");
        System.out.println("\t 10 - To display list of rooms in hotels.");

        System.out.println("\t 11 - To make a booking.");

        System.out.println("\t 12 - To register.");
        System.out.println("\t 13 - To quit application.");
    }


    /**----------------------------------------------------------**/


    public static void addCity() {
        try {
            hsi.addCity(city1);
            hsi.addCity(city2);
            hsi.addCity(city3);
        } catch (Exception e) {
            System.out.println("Enter valid city.");
        }
        System.out.println("3 Cities added.");
    }

   /**-----------------------------------------------------------------------------------**/

    public static void removeCity() {
        System.out.println("Enter city ID");
        int cityId = scan.nextInt();
        scan.nextLine();

        try {
            switch (cityId) {
                case 1:
                    hsi.removeCity(city1);
                    System.out.println("City " + "1" + " removed.");
                    break;
                case 2:
                    hsi.removeCity(city2);
                    System.out.println("City " + "2" + " removed.");
                    break;
                case 3:
                    hsi.removeCity(city3);
                    System.out.println("City " + "3" + " removed.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Enter valid city id.");
        }
    }

    /**--------------------------------------------------------------------------------**/

    public static void addHotel(int cityId) {
        try {
            switch(cityId){
                case 1:
                hsi.addHotel(hotel11);
                hsi.addHotel(hotel12);
                hsi.addHotel(hotel13);
                break;
                case 2:
                hsi.addHotel(hotel21);
                hsi.addHotel(hotel22);
                hsi.addHotel(hotel23);
                break;
                case 3:
                hsi.addHotel(hotel31);
                hsi.addHotel(hotel32);
                hsi.addHotel(hotel33);
                break;
            }


        } catch (Exception e) {
            System.out.println("Enter valid hotel details.");
        }
        System.out.println("3 Hotels added.");

    }

    public static void removeHotel(int cityId) {

    }

    public static void addRoom() {

    }

    public static void removeRoom() {

    }


}
