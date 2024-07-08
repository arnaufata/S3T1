package n3exercici1.Vehicles;

public class Avio implements Vehicle {
    private String name;

    public Avio(String name) {
        this.name = name;
    }

    @Override
    public void arrencar() {
        System.out.println("Enlairant avió...");
    }

    @Override
    public void accelerar() {
        System.out.println("Avió accelerant!");
    }

    @Override
    public void frenar() {
        System.out.println("Avió baixant...");
    }

    @Override
    public String getName() {
        return name;
    }
}
