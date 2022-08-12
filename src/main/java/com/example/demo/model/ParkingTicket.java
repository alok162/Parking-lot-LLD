package com.example.demo.model;

import java.time.LocalDateTime;

public class ParkingTicket {

    private final String id;
    private final Vehicle assignedVehicle;
    private final ParkingSpot assignedSpot;
    private final LocalDateTime issueAt;
    private double price;

    public ParkingTicket(String id, String assignedVehicleId, Vehicle assignedVehicle, ParkingSpot assignedSpot, LocalDateTime issueAt, double price) {
        this.id = id;
        this.assignedVehicle = assignedVehicle;
        this.assignedSpot = assignedSpot;
        this.issueAt = issueAt;
        this.price = price;
    }
}
