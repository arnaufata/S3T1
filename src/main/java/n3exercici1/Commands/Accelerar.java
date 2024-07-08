package n3exercici1.Commands;

import n3exercici1.Vehicles.Vehicle;

public class Accelerar implements Command {
    private Vehicle vehicle;

    public Accelerar (Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.accelerar();
    }
}
