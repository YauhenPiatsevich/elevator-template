package com.epam.training.concurrency.task;

import com.epam.training.concurrency.Controller;
import com.epam.training.concurrency.model.Passenger;

public class PassengerTransportationTask implements Runnable {

    private final Passenger passenger;
    private final Controller controller;

    public PassengerTransportationTask(Passenger passenger, Controller controller) {
        this.passenger = passenger;
        this.controller = controller;
    }

    public void run() {

    }
}
