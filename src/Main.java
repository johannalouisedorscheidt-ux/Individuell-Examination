
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AccountRegister register = new AccountRegister();

        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        while (choice != 6) {

            System.out.println("1. Skapa upp kontot: ");
            System.out.println("2. Lista alla konton: ");
            System.out.println("3. Sätt in pengar: ");
            System.out.println("4. Ta ut pengar: ");
            System.out.println("5. Beräkna och lägg till ränta: ");
            System.out.println("6. Avsluta");
            System.out.println("Val: ");

            try {
            choice = scanner.nextInt();
            scanner.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("Fel! Du måste skriva en siffra.");

                scanner.nextLine();
                continue;
            }


            if (choice == 1) {

                System.out.println("Namn på ägaren: ");

                String name = scanner.nextLine();

                int balance = 0;
                boolean correctInput = false;

                while (!correctInput) {
                    try {
                        System.out.println("Ange start saldot: ");
                        balance = scanner.nextInt();
                        scanner.nextLine();

                        if (balance < 0) {
                            System.out.println("Start saldot får inte vara negativt!");
                        } else {
                            correctInput = true;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("En felaktig inmatning har gjorts, det måste vara ett heltal");
                        scanner.nextLine();
                    }
                }

                    register.createAccount(name, balance);
                    System.out.println("Kontot har nu skapats!");

            } else if (choice == 2) {
                register.printAll();



            } else if (choice == 3) {

                System.out.println("Name: ");

                String name = scanner.nextLine();

                Account found = register.findAccount(name);

                if (found != null) {
                    int amount = 0;
                    boolean correctInput= false;

                    while (!correctInput) {
                        try {
                            System.out.println("Sätt in pengar: ");
                            amount = scanner.nextInt();
                            scanner.nextLine();

                            correctInput = true;

                        } catch (InputMismatchException e) {
                            System.out.println("Felaktig inmatning! Det måste vara siffror");
                            scanner.nextLine();
                        }
                    }

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
                    int amount = 0;
                    boolean correctInput = false;

                    while (!correctInput) {
                        try {
                            System.out.println("Ta ut pengar: ");
                            amount = scanner.nextInt();
                            scanner.nextLine();

                            correctInput = true;

                        } catch (InputMismatchException e) {
                            System.out.println("Felaktig inmatning! Det måste vara siffror");
                            scanner.nextLine();
                        }
                    }

                    found.withdraw(amount);
                    System.out.println("Det nya saldot: " + found.getBalance());

                } else {
                    System.out.println("Kontot saknas: " + name);
                }



            } else if (choice == 5) {

                System.out.println("Namn: ");

                String name = scanner.nextLine();

                Account found = register.findAccount(name);

                if (found != null) {
                    found.applyInterest();
                } else {
                    System.out.println("Kontot saknas: " + name);
                }



                } else if (choice == 6) {
                    System.out.println("Konto appen stängs ner! ");

                } else {
                    System.out.println("Ett ogiltigt val av nummer har gjorts! ");

                }
            }
        }
    }