
public class Account {
    private String name;
    private int balance;

    public Account(String name, int balance){
        this.name = name;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
          if (amount <= 0) {
              System.out.println("Insättningen måste vara ett positivt belopp");
        } else {
              balance += amount;
              System.out.println("Transaktionen lyckades! " + "Saldot: " + balance);
          }
    }

    public void withdraw(int amount){
        if (amount <= 0) {
            System.out.println("Uttaget måste vara större än 0");

        } else if (amount > balance) {
            System.out.println("Transaktion nekades! finns inte tillräckligt med saldo!");

        } else {
            balance -= amount;
            System.out.println("Transaktion lyckades! "  + "Saldot " + balance);
       }
    }
    public void applyInterest() {
        int interest = balance * 5 / 100;
        balance += interest;

        System.out.println("Ränta: " + interest + " kr");
        System.out.println("Nytt saldo: " + balance + " kr");

    }





}