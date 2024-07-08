package n2exercici1;

import java.util.Scanner;

public class Menu {
        private Scanner teclat;
        private Agenda agenda = new Agenda();

        public Menu(Scanner teclat){
            this.teclat = teclat;
        }

        public void startMenu() {
            int option;
            do {
                printMenu();
                option = teclat.nextByte();
                teclat.nextLine();
                switch (option) {
                    case 1:
                        addSomething();
                        break;
                    case 2:
                        agenda.printEntries();
                        break;
                    case 3:
                        System.out.println("Bye bye!");
                        break;
                    default:
                        System.out.println("Invalid option.");
                        break;
                }
            } while (option != 3);
        }

        private void printMenu() {
            System.out.println("Select an option:\n" +
                    "1. Add.\n" +
                    "2. View existing contacts.\n" +
                    "3. Exit.");
        }

        private void addSomething() {
            System.out.println("What type of entry do you want to make: 'address' or 'phonenumber'? Write it down");
            String type = teclat.nextLine();
            System.out.println("Indicate the country: (Catalonia, Italy, Portugal)");
            String country = teclat.nextLine();
            agenda.addEntry(type, country, teclat);
        }
    }

