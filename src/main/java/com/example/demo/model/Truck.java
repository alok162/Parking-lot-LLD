package com.example.demo.model;

public class Truck extends Vehicle{
    public Truck(String licenseNumber, String vehicleNumber) {
        super(licenseNumber, vehicleNumber, VehicleType.TRUCK, parkingTicket);
    }
}
