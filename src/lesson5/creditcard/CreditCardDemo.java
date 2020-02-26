package lesson5.creditcard;

public class CreditCardDemo {

  public static void main(String[] args) {

    CreditCard myCard = new CreditCard("6467041946153399", "1234");
    myCard.setCardCreditLimit(500);


//    System.out.println(myCard.getCardBalance());

    myCard.deposit(150, "1234");
//    myCard.withdraw(50, "1234");
//    myCard.withdraw(50, "1422451234");

//    System.out.println(myCard.getCardBalance());

/*​
//Should reject operation due to incorrect pin
    myCard.deposit(500, "4321");
​
//Should reject operation due to incorrect pin
    myCard.withdraw(500, "4321");
​
//Should reject operation because amount exceeds limit
    myCard.withdraw(5000, "1234");
​
//Should complete operation because limit is increased to 7500
    myCard.setCardCreditLimit(7500);
    myCard.withdraw(5000, "1234");*/
  }
}
