
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
        balance += amount;
    }

    public void withdraw(int amount){
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Det finns inte tillräckligt med pengar på kontot!");
        }
    }

}