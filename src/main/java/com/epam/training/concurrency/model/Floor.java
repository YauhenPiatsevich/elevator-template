package com.epam.training.concurrency.model;

import java.util.ArrayList;
import java.util.List;

public class Floor {

    private final List<Passenger> dispatchContainer;
    private final List<Passenger> arrivalContainer;

    public Floor() {
        this.dispatchContainer = new ArrayList<Passenger>();
        this.arrivalContainer = new ArrayList<Passenger>();
    }
}
