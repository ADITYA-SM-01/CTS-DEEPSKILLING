public class Test {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PayPalGateWayAdapter();
        paymentProcessor.processPayment();
    }
}
