package lesson5.creditcard;

public class CreditCard {

  private String cardNumber;
  private String cardPinCode;
  private int cardBalance;
  private int cardCreditLimit;
  private int cardLoanDebt;

  public CreditCard(String cardNumber, String cardPinCode) {
    this.cardNumber = cardNumber;
    this.cardPinCode = cardPinCode;
    this.cardBalance = 0;
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

  public void deposit() {

  }

  public void withdraw() {

  }
}
