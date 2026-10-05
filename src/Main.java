import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // skapat upp ett register som vi använder för att hålla reda på alla konton
        AccountRegister register = new AccountRegister();

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        // och while loopen som fortsätter att visa menyn så länge användaren inte väljer 5
        while (choice != 5) {

            System.out.println("1. Skapa upp kontot: ");
            System.out.println("2. Lista alla konton: ");
            System.out.println("3. Sätt in pengar: ");
            System.out.println("4. Ta ur pengar: ");
            System.out.println("5. Avslut");
            System.out.println("Val: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                System.out.println("Namn på ägaren: ");
                String name = scanner.nextLine();
                System.out.println("Ange Start Saldot: ");
                int balance = scanner.nextInt();
                scanner.nextLine();

                register.createAccount(name, balance);
                System.out.println("Kontot Har Nu Skapats!");

            } else if (choice == 2) {
                register.printAll();

            } else if (choice == 3) {
                System.out.println("Name: ");
                String name = scanner.nextLine();

                Account found = register.findAccount(name);

                if (found != null) {
                    System.out.println("Sätt in pengar: ");
                    int amount = scanner.nextInt();
                    found.deposit(amount);
                    System.out.println("Det Nya Saldot: " + found.getBalance());
                } else {
                    System.out.println("Kontot Saknas: " + name);
                }

            } else if (choice == 4) {

                System.out.println("Name: ");
                String name = scanner.nextLine();

                Account found = register.findAccount(name);

                if (found != null) {
                    System.out.println("Ta ut pengar: ");
                    int amount = scanner.nextInt();

                    found.withdraw(amount);

                    System.out.println("Det Nya Saldot: " + found.getBalance());
                } else {
                    System.out.println("Kontot Saknas: " + name);

                }

                } else if (choice == 5) {
                    System.out.println("Konto appen stängs ner! ");
                    // Avslut av programmet

                } else {
                    System.out.println("Ett ogiltigt val har gjorts, försök igen! ");

                }
            }
        }
    }