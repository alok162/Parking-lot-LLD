package com.example.demo.model;

public class Car extends Vehicle{

    public Car(String licenseNumber, String vehicleNumber) {
        super(licenseNumber, vehicleNumber, VehicleType.CAR, parkingTicket);
    }
}
