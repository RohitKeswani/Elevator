package models;

import controllers.ElevatorController;
import models.Buttons.ElevatorButton;
import models.Buttons.FloorButton;

import java.util.TreeMap;

public class ElevatorRequest {
    //private ElevatorController elevatorController = new ElevatorController();
    private TreeMap<Integer, Integer> floorButtonHashMap = new TreeMap<>();
    private TreeMap<Integer, Integer>  elevatorButtonHashMap = new TreeMap<>();

    public boolean requestsRemaining(){
        if(floorButtonHashMap.isEmpty() && elevatorButtonHashMap.isEmpty())
            return false;
        else
            return true;
    }

    public void acceptRequest(FloorButton floorButton){
        floorButtonHashMap.put(floorButton.getFloor(),
                floorButtonHashMap.getOrDefault(floorButton.getFloor(), 0)+1);
        //elevatorController.requestElevatorFromFloor(floorButton.getFloor());
    }

    public void acceptRequest(ElevatorButton elevatorButton){
        elevatorButtonHashMap.put(elevatorButton.getFloor(),
                elevatorButtonHashMap.getOrDefault(elevatorButton.getFloor(), 0)+1);
        //elevatorController.requestElevatorToFloor(elevatorButton.getFloor());
    }


    public void readFromFloorRequest() {
        if(!floorButtonHashMap.isEmpty()){

        }
    }

    public void readToFloorRequest() {
    }
}
