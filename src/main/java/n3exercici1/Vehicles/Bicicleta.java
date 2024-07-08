package n3exercici1.Vehicles;

public class Bicicleta implements Vehicle {
    private String name;

    public Bicicleta(String name) {
        this.name = name;
    }

    @Override
    public void arrencar() {
        System.out.println("Començant a pedalar...");
    }

    @Override
    public void accelerar() {
        System.out.println("Pedalant més fort!");
    }

    @Override
    public void frenar() {
        System.out.println("Deixant de pedalar...");
    }

    @Override
    public String getName() {
        return name;
    }
}
