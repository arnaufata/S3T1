package n2exercici1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclat = new Scanner(System.in);
        Menu menu = new Menu(teclat);
        menu.startMenu();
    }
}
