package com.epam.training.concurrency.model;

import java.util.List;

public class Building {
    private final List<Floor> floors;
    private final Elevator elevator;

    public Building(List<Floor> floors, Elevator elevator) {
        this.floors = floors;
        this.elevator = elevator;
    }
}
