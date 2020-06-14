package models.Buttons;

import models.ElevatorRequest;
import models.Passenger;

public class FloorButton extends Button {

    public FloorButton(int floor) {
        super(floor);
    }

    public void placeRequest(Passenger passenger, ElevatorRequest elevatorRequest){
        //TODO place request to Elevator Request Class.
        elevatorRequest.acceptRequest(passenger.getFloorButton());
    }
}
