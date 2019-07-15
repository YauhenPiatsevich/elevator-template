package com.epam.training.concurrency.task;

import com.epam.training.concurrency.Controller;
import com.epam.training.concurrency.model.Elevator;

public class ElevatorMovementTask implements Runnable {

    private final Elevator elevator;
    private final Controller controller;

    public ElevatorMovementTask(Elevator elevator, Controller controller) {
        this.elevator = elevator;
        this.controller = controller;
    }

    public void run() {

    }
}
