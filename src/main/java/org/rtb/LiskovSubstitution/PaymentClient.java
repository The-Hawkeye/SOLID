package org.rtb.LiskovSubstitution;

public class PaymentClient {
    public void processTransaction(IPayment payment) {
        payment.pay();
        payment.refund();
    }
}
