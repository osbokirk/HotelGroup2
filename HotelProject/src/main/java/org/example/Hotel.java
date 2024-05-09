package org.example;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public void Hotel(String name,int numberOfSuites,int numberOfRooms){
        this.name = name;
        this.numberOfSuites= numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }
    public void Hotel(String name,int numberOfSuites,int numberOfRooms,int bookedSuites,int bookedBasicRooms){
        this.name = name;
        this.numberOfSuites= numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }
}
