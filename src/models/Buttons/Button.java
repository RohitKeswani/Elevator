package models.Buttons;

import models.ElevatorRequest;
import models.Passenger;

abstract public class Button {
    private boolean illuminate = false;
    private int floor;

    public int getFloor() {
        return floor;
    }

    public Button(int floor){
        this.floor = floor;
        toggleIllumniation();
    }

    public void toggleIllumniation(){
        this.illuminate = !this.illuminate;
    }

    abstract void placeRequest(Passenger passenger, ElevatorRequest elevatorRequest);
}
