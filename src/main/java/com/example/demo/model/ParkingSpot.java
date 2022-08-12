package com.example.demo.model;

public abstract class ParkingSpot {

    private final String id;
    private boolean isFree;
    private ParkingSpotType type;
    private Vehicle assignedVehicle;

    public ParkingSpot(String id, ParkingSpotType type) {
        this.id = id;
        this.isFree = true;
        this.type = type;
    }

    public void assignVehicle(Vehicle vehicle) {
        this.isFree = false;
        this.assignedVehicle = vehicle;
    }

    public void vacateSpot() {
        this.isFree = true;
        this.assignedVehicle = null;
    }
}
