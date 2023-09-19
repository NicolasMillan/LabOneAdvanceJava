package com.example.labone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hotel {

    private String franchise;
    private String roomType;
    private int roomNumber;
    private double price;
    private boolean isAvailable;

    //Constructors
    public Hotel(String franchise, String roomType, int roomNumber, double price, boolean isAvailable) {
        setFranchise(franchise);
        setRoomType(roomType);
        setRoomNumber(roomNumber);
        setPrice(price);
        setAvailable(isAvailable);
    }

    //Getters & Setters
    public String getFranchise() {
        return franchise;
    }
    public void setFranchise(String franchise) {
        if(franchise.isBlank()){
            throw new IllegalArgumentException("Company Not Selected");
        }
        else {
            this.franchise = franchise;
        }
    }


    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        List<String> rooms = Arrays.asList("Penthouse", "Executive", "Apartment", "Suite");
        if(rooms.contains(roomType)){
            this.roomType = roomType;
        } else {
            throw new IllegalArgumentException("Your Room Doesn't Math With Our Listing" + rooms);
        }
    }
    public static List<String> roomsTypeList(){
        return  Arrays.asList("Penthouse", "Executive", "Apartment", "Suite");
    }


    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        if(roomNumber < 0 || roomNumber > 500){
            throw new IllegalArgumentException("Room number is not in our system");
        }else{
            this.roomNumber = roomNumber;
        }
    }


    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price < 0){
            throw new IllegalArgumentException("Not Rooms Found With The Budget");
        }else{
            this.price = price;
        }
    }


    public boolean getIsAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    //to String
    @Override
    public String toString() {
        return "Hotel" +
                "Franchise: " + franchise +
                ", roomType: " + roomType +
                ", roomNumber: " + roomNumber +
                ", price: " + price +
                ", isAvailable: " + (isAvailable ? "Yes" : "No");
    }
}
