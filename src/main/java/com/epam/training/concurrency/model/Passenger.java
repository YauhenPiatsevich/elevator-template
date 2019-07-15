package com.epam.training.concurrency.model;

public class Passenger {

    private final int id;
    private final int sourceFloor;
    private final int destinationFloor;

    private TransportationState transportationState;

    public Passenger(int id, int sourceFloor, int destinationFloor) {
        this.id = id;
        this.sourceFloor = sourceFloor;
        this.destinationFloor = destinationFloor;
    }
}
