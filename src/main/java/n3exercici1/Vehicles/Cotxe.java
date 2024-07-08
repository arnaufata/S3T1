package n3exercici1.Vehicles;

public class Cotxe implements Vehicle {
    private String name;

    public Cotxe(String name) {
        this.name = name;
    }

    @Override
    public void arrencar() {
        System.out.println("Cotxe arrencant...");
    }

    @Override
    public void accelerar() {
        System.out.println("Cotxe accelerant!");
    }

    @Override
    public void frenar() {
        System.out.println("Cotxe frenant...");
    }

    @Override
    public String getName() {
        return name;
    }
}
