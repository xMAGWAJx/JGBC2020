package lesson05.creditcard;

public class CreditCard {

  private String cardNumber;
  private String cardPinCode;
  private int cardBalance;
  private int cardCreditLimit;
  private int cardLoanDebt;

  public CreditCard(String cardNumber, String cardPinCode) {
    this.cardNumber = cardNumber;
    this.cardPinCode = cardPinCode;
    this.cardBalance = 1000;
    this.cardLoanDebt = 0;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getCardPinCode() {
    return cardPinCode;
  }

  public void setCardPinCode(String cardPinCode) {
    this.cardPinCode = cardPinCode;
  }

  public int getCardBalance() {
    return cardBalance;
  }

  public void setCardBalance(int cardBalance) {
    this.cardBalance = cardBalance;
  }

  public int getCardCreditLimit() {
    return cardCreditLimit;
  }

  public void setCardCreditLimit(int cardCreditLimit) {
    this.cardCreditLimit = cardCreditLimit;
  }

  public int getCardLoanDebt() {
    return cardLoanDebt;
  }

  public void setCardLoanDebt(int cardLoanDebt) {
    this.cardLoanDebt = cardLoanDebt;
  }

  public void deposit(int depositToBalance, String enteredCardPinCode) {
      if (cardPinCode != enteredCardPinCode) {
          System.out.println("Access denied - wrong pin number.");
      }else if (enteredCardPinCode.equals(cardPinCode)) {
        this.cardBalance += depositToBalance;
      } else {
        System.out.println("somethisg");
      }
  }

  public void withdraw(int withdrawAmount, String enteredCardPinCode) {

//      int cardBalanceAndCreditLimit = this.cardBalance + this.cardCreditLimit;
//
//      if (enteredCardPinCode.equals(cardPinCode) && (cardBalanceAndCreditLimit >= withdrawAmount)) {
////          this.cardBalance -= withdrawAmount;
//        cardBalanceAndCreditLimit - withdrawAmount;
//      } else if (cardPinCode != enteredCardPinCode) {
//        System.out.println("Access denied - wrong pin number.");
//      }else {
//        System.out.println("Out off money");
//      }
  }
}
