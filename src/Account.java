
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
              System.out.println("Otillräckligt med saldo");
        } else {
              balance += amount;
              System.out.println("Transaktionen lyckades! " + "Saldot: " + balance);
          }

    }

    public void withdraw(int amount){
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Det finns inte tillräckligt med pengar på kontot!");
        }
    }

}