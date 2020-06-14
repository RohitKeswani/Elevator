package models.Elevator;

public class Elevator {
    private int currentFloor = 1;
    private int maxFloor = 10;
    private int currentCapacity = 0;
    final private int maxCapacity = 10;
    private boolean doorsOpen = false;
    private Direction direction = Direction.UP;
    private State state = State.IDLE;

    public void moveUp(){
        if(this.currentFloor<this.maxFloor-1)
            this.currentFloor++;
    }

    public void moveDown(){
        if(this.currentFloor>1)
            this.currentFloor--;
    }

    public void loadPassengers(){
        if(this.currentCapacity<this.maxCapacity-1)
            this.currentCapacity++;
    }

    public void unloadPassengers(){
        if(this.currentCapacity>1){
            this.currentCapacity--;
        }
    }

    public void openDoors(){
        this.doorsOpen = true;
    }

    public void closeDoors(){
        this.doorsOpen = false;
    }

    public String getElevatorStatistics(){
        return "Elevator Statistics-> CurrentCapacity: "+this.currentCapacity+" MaximumCapacity: "+this.maxCapacity+
                " CurrentFloor: "+this.currentFloor+" Doors Open: "+this.doorsOpen+" Direction: "+this.direction
                +" State: "+this.state;
    }
}
