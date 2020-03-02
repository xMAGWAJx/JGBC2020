package lesson8.payment;

public class PaymentDemo {
  public static void main(String[] args) {
    Payment bankPayment = new BankPayment("LV123454321BANK", "LV567898765BANK");
    Payment paypalPayment = new PaypalPayment("sender@mail.lv", "receiver@mail.lv");
    executePayment(bankPayment, 15);
    System.out.println();
    executePayment(paypalPayment, 20);
  }

  public static void executePayment(Payment payment, int amount) {
    System.out.println("Executing payment:");
    payment.process(amount);
  }
}
