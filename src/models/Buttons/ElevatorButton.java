package models.Buttons;

import models.ElevatorRequest;
import models.Passenger;

public class ElevatorButton extends Button {

    public ElevatorButton(int floor) {
        super(floor);
    }

    public void placeRequest(Passenger passenger, ElevatorRequest elevatorRequest){
        //TODO place request to Elevator Request Class
        elevatorRequest.acceptRequest(passenger.getElevatorButton());
    }
}
