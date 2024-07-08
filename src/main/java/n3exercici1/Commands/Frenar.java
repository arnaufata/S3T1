package n3exercici1.Commands;

import n3exercici1.Vehicles.Vehicle;

public class Frenar implements Command{
    private Vehicle vehicle;

    public Frenar (Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.frenar();
    }
}
