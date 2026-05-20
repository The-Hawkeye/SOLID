package org.rtb.LiskovSubstitution;

import java.util.ArrayList;
import java.util.List;

public class TestPayment {
    public static void main(String[] args) {
        PaymentClient client = new PaymentClient();
        List<IPayment> paymentList = List.of(new UPI(), new CreditCard(), new Crypto());

        for(IPayment payment : paymentList) {
            client.processTransaction(payment);
        }
    }
}
