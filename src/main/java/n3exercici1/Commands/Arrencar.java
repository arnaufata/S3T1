package n3exercici1.Commands;

import n3exercici1.Vehicles.Vehicle;

public class Arrencar implements Command {
    private Vehicle vehicle;

    public Arrencar (Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.arrencar();
    }
}
