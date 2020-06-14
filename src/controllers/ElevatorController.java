package controllers;

import models.Elevator.Elevator;
import models.ElevatorRequest;

public class ElevatorController {
    private Elevator elevator = new Elevator();

    public void requestElevatorFromFloor(int startFloor){
        //TODO write logic to check if elevator can move to that start floor. if all okay call elevator.moveUp();
        elevator.moveUp();
    }

    public void requestElevatorToFloor(int destinationFloor) {
        elevator.moveDown();
    }

    public String requestElevatorState(){
        return elevator.getElevatorStatistics();
    }

    public void startElevator(PassengerController passengerController) {
        ElevatorRequest elevatorRequest = passengerController.elevatorRequest;

    }
}
