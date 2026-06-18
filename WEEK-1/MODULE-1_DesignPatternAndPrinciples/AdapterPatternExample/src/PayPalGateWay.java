public class PayPalGateWay{

    public int processPayment(){
        System.out.println("payment using paypal gateway..");
        return 1; // 1 - success, 0 - cancelled , -1 - failed
    }
}
