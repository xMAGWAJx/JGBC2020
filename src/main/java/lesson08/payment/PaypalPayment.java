package lesson08.payment;

public class PaypalPayment implements Payment {
    private String senderEmail;
    private String receiverEmail;

    public PaypalPayment(String senderEmail, String receiverEmail) {
        this.senderEmail = senderEmail;
        this.receiverEmail = receiverEmail;
    }

    @Override
    public void process(int amount) {
        System.out.println("Processing Paypal Payment:");
        System.out.println("Transferring '" + amount + "€' from PayPal '" + senderEmail + "' to PayPal '" + receiverEmail + "'");
    }
}
