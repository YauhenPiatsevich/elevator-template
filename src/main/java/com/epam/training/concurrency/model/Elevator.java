package com.epam.training.concurrency.model;

import java.util.ArrayList;
import java.util.List;

public class Elevator {

    private final int topFloor;
    private final int capacity;
    private final List<Passenger> container;

    private int currentFloor;
    private MovementDirection movementDirection;

    public Elevator(int topFloor, int capacity) {
        this.topFloor = topFloor;
        this.capacity = capacity;
        this.container = new ArrayList<Passenger>();
    }
}
