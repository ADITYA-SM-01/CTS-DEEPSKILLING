public class PayPalGateWayAdapter implements PaymentProcessor{
    @Override
    public void processPayment() {
        PayPalGateWay payPalGateWay = new PayPalGateWay();
        int result = payPalGateWay.processPayment();
        switch (result){
            case 1:
                System.out.println("Payment Successful");
                break;
            case 0:
                System.out.println("Payment cancelled");
                break;
            default:
                System.out.println("Payment Failed");
        }
    }
}
