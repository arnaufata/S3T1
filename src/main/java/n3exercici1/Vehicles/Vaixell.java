package n3exercici1.Vehicles;

public class Vaixell implements Vehicle {
    private String name;

    public Vaixell(String name) {
        this.name = name;
    }

    @Override
    public void arrencar() {
        System.out.println("Vaixell arrencant...");
    }

    @Override
    public void accelerar() {
        System.out.println("Vaixell accelerant!");
    }

    @Override
    public void frenar() {
        System.out.println("Vaixell disminuint velocitat...");
    }

    @Override
    public String getName() {
        return name;
    }
}
