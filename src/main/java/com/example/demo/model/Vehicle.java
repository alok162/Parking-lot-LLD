package com.example.demo.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public abstract class Vehicle {

    private final String licenseNumber;
    private final String vehicleNumber;
    private final VehicleType vehicleType;
    private ParkingTicket parkingTicket;

    public Vehicle(String licenseNumber, String vehicleNumber, VehicleType vehicleType, ParkingTicket parkingTicket) {
        this.licenseNumber = licenseNumber;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.parkingTicket = parkingTicket;
    }

    public void assignTicket(ParkingTicket parkingTicket) {
        this.parkingTicket = parkingTicket;
    }
}
