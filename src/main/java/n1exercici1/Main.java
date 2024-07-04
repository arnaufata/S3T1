package n1exercici1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Undo undo = Undo.getInstance();
        Scanner teclat = new Scanner(System.in);

        boolean sortir = false;

        do{
            switch(menu(teclat)){
                case 1:
                    undo.afegirComanda(comanda(teclat));
                    break;
                case 2:
                    undo.eliminarComanda();
                    System.out.println("Última comanda desfeta!");
                    break;
                case 3:
                    undo.llistarComandes();
                    break;
                case 4:
                    System.out.println("Gràcies per utilitzar l'aplicació");
                    sortir = true;
                    break;
            }
        }while(!sortir);

        teclat.close();
    }

    public static byte menu(Scanner teclat){
        byte opcio;
        final byte MINIMO = 1;
        final byte MAXIMO = 4;

        do{
            System.out.println("\nMENú PRINCIPAL");
            System.out.println("1. Afegir comanda.");
            System.out.println("2. Desfer última comanda.");
            System.out.println("3. Llistar comandes.");
            System.out.println("4. Sortir de l'aplicació.");
            System.out.println("Selecciona una opció:");
            opcio = teclat.nextByte();
            teclat.nextLine();
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }

    public static String comanda(Scanner teclat){
        System.out.println("Introdueix la comanda: ");
        return teclat.nextLine();
    }

}
