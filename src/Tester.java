import controllers.ElevatorController;
import models.Passenger;
import controllers.PassengerController;

public class Tester {
    public static void main(String[] args) {
        ElevatorController elevatorController = new ElevatorController();
        PassengerController passengerController = new PassengerController();
        Passenger passenger = passengerController.createPassenger(1, 5);
        passengerController.requestElevator(passenger);
        passengerController.requestDestination(passenger);
        elevatorController.startElevator(passengerController);
    }
}
