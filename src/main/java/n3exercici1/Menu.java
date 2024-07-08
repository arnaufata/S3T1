package n3exercici1;

import n3exercici1.Commands.Accelerar;
import n3exercici1.Commands.Arrencar;
import n3exercici1.Commands.Frenar;
import n3exercici1.Vehicles.*;

import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    private static Scanner teclat;
    private static final ControladorParking controladorParking = new ControladorParking(new HashMap<>());

    public Menu(Scanner teclat) {
        this.teclat = teclat;
        addVehicles();
    }

    public void addVehicles() {
        Bicicleta bicicleta = new Bicicleta("Bicicleta");
        Cotxe cotxe = new Cotxe("Cotxe");
        Avio avio = new Avio("Avio");
        Vaixell vaixell = new Vaixell("Vaixell");

        controladorParking.addVehicle(1, bicicleta);
        controladorParking.addVehicle(2, cotxe);
        controladorParking.addVehicle(3, avio);
        controladorParking.addVehicle(4, vaixell);
    }

    public void startMenu() {
        System.out.println("Selecciona el vehícle o prem 0 per a sortir.");

        int option;
        do {
            showVehicles();
            option = teclat.nextInt();
            switch (option) {
                case 1:
                    showCommands(controladorParking.getVehicle(1));
                    break;
                case 2:
                    showCommands(controladorParking.getVehicle(2));
                    break;
                case 3:
                    showCommands(controladorParking.getVehicle(3));
                    break;
                case 4:
                    showCommands(controladorParking.getVehicle(4));
                    break;
                case 0:
                    System.out.println("Adéu-siau!");
                    break;
                default:
                    System.out.println("Opció invàlida");
            }
        }while (option != 0);
    }

    private void showVehicles() {
        System.out.println("Vehícles disponibles: ");
        int size = controladorParking.getSize();

        for(int i = 1; i <= size; i++) {
            Vehicle vehicle = controladorParking.getVehicle(i);
            System.out.println(i + ".- " + vehicle.getName());
        }
    }

    public void showCommands(Vehicle vehicle) {
        System.out.println("Commands per a: " + vehicle.getName() + ": \n" +
                "1. Arrencar\n" +
                "2. Accelerar\n" +
                "3. Frenar\n");
        int option = teclat.nextInt();
        teclat.nextLine();
        switch (option) {
            case 1:
                controladorParking.execute(new Arrencar(vehicle));
                break;
            case 2:
                controladorParking.execute(new Accelerar(vehicle));
                break;
            case 3:
                controladorParking.execute(new Frenar(vehicle));
                break;
            default:
                System.out.println("Command no vàlid!");
        }
    }
}
