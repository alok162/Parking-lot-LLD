package com.example.demo.model;

public abstract class ParkingFloor {

    private final String floorId;
    private final String floorName;

    protected ParkingFloor(String floorId, String floorName) {
        this.floorId = floorId;
        this.floorName = floorName;
    }
}
