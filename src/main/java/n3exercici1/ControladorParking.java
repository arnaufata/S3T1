package n3exercici1;

import n3exercici1.Commands.Command;
import n3exercici1.Vehicles.Vehicle;

import java.util.Map;

public class ControladorParking {
    private Map<Integer, Vehicle> vehicles;

    public ControladorParking(Map<Integer, Vehicle> vehicles) {
        this.vehicles=vehicles;
    }

    public void addVehicle(int id, Vehicle vehicle) {
        vehicles.put(id, vehicle);
    }

    public Vehicle getVehicle(int id) {
        return vehicles.get(id);
    }

    public int getSize() {
        return vehicles.size();
    }

    public void execute(Command command) {
        command.execute();
    }

}
