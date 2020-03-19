package lesson05.bankaccount;

public class BankAccount {
    private int balance;

    public void deposit(int amount) {
        this.balance += amount;
    }
    public void withdraw(int amount) {
        this.balance -= amount;
    }
    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
