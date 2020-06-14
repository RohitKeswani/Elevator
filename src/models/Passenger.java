package models;

import models.Buttons.ElevatorButton;
import models.Buttons.FloorButton;

public class Passenger {
    private FloorButton floorButton;
    private ElevatorButton elevatorButton;

    public FloorButton getFloorButton() {
        return floorButton;
    }

    public ElevatorButton getElevatorButton() {
        return elevatorButton;
    }

    public Passenger(FloorButton floorButton, ElevatorButton elevatorButton){
        this.floorButton = floorButton;
        this.elevatorButton = elevatorButton;
    }
}
