package controllers;

import models.Buttons.ElevatorButton;
import models.ElevatorRequest;
import models.Buttons.FloorButton;
import models.Passenger;

public class PassengerController {
    ElevatorRequest elevatorRequest = new ElevatorRequest();

    public Passenger createPassenger(int startFloor, int destinationFloor){
        FloorButton floorButton = new FloorButton(startFloor);
        ElevatorButton elevatorButton = new ElevatorButton(destinationFloor);
        Passenger passenger = new Passenger(floorButton, elevatorButton);
        return passenger;
    }

    public void requestElevator(Passenger passenger) {
        passenger.getFloorButton().placeRequest(passenger, elevatorRequest);
    }

    public void requestDestination(Passenger passenger) {
        passenger.getElevatorButton().placeRequest(passenger, elevatorRequest);
    }
}
