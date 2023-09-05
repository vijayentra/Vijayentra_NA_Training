public class Payment {
private int paymentId;
    private float amount;
    private String paymentStatus;

    public Payment(int paymentId, float amount, String paymentStatus) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }

    public void processPayment() {
        // Process the payment
        System.out.println("Processing payment of " + amount);
        this.paymentStatus = "Completed";
        System.out.println("Payment processed successfully!");
    }

}
