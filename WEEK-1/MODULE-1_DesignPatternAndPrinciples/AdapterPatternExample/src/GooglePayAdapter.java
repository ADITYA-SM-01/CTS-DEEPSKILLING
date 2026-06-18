public class GooglePayAdapter implements PaymentProcessor{
    @Override
    public void processPayment() {
        GooglePayGateWay googlePayGateWay = new GooglePayGateWay();
        boolean result = googlePayGateWay.doPayment();
        if(result){
            System.out.println("Payment Successfull");
        }else{
            System.out.println("Payment Failed");
        }
    }
}
