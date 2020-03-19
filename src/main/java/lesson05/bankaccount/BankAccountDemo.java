package lesson05.bankaccount;

public class BankAccountDemo {


    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println("Balance = " + account.getBalance());
        account.deposit(500);
        System.out.println("Balance = " + account.getBalance());
        account.withdraw(200);
        System.out.println("Balance = " + account.getBalance());

        // New Balance after setBalance

        account.setBalance(150);
        System.out.println("New balance after setBalance = " + account.getBalance());
    }
}