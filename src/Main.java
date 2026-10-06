import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AccountRegister register = new AccountRegister();

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {

            System.out.println("1. Skapa upp kontot: ");
            System.out.println("2. Lista alla konton: ");
            System.out.println("3. Sätt in pengar: ");
            System.out.println("4. Ta ut pengar: ");
            System.out.println("5. Avslut");
            System.out.println("Val: ");

            choice = scanner.nextInt();
            scanner.nextLine();


            if (choice == 1) {

                System.out.println("Namn på ägaren: ");
                String name = scanner.nextLine();
                System.out.println("Ange start saldot: ");
                int balance = scanner.nextInt();
                scanner.nextLine();

                register.createAccount(name, balance);
                System.out.println("Kontot har nu skapats!");

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
                    System.out.println("Det nya saldot: " + found.getBalance());
                } else {
                    System.out.println("Kontot saknas: " + name);
                }

            } else if (choice == 4) {

                System.out.println("Name: ");

                String name = scanner.nextLine();

                Account found = register.findAccount(name);

                if (found != null) {
                    System.out.println("Ta ut pengar: ");
                    int amount = scanner.nextInt();

                    found.withdraw(amount);

                    System.out.println("Det nya saldot: " + found.getBalance());
                } else {
                    System.out.println("Kontot saknas: " + name);
                }

                } else if (choice == 5) {
                    System.out.println("Konto appen stängs ner! ");

                } else {
                    System.out.println("Ett ogiltigt val av nummer har gjorts! ");

                }
            }
        }
    }