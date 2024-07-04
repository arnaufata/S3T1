package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static  Undo instancia;
    private List<String> historialComandes;

    private Undo(){
        historialComandes = new ArrayList<>();
    }

    public static Undo getInstance(){
        if(instancia == null) {
            instancia = new Undo();
        }
        return instancia;
    }

    public void afegirComanda (String command){
        historialComandes.add(command);
    }

    public void eliminarComanda(){
        if(!historialComandes.isEmpty()){
            historialComandes.removeLast();
        }
    }

    public void llistarComandes(){
        if(historialComandes.isEmpty()){
            System.out.println("No hi ha comandes a l'historial!");
        } else {
            for(int i = 0; i < historialComandes.size(); i++){
                System.out.println((i + 1) + ".- " + historialComandes.get(i));
            }
        }
    }

}
