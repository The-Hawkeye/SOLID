package org.rtb.OpenClosedPrinciple;

public class UpiPaymentService implements IPaymentService {
    @Override
    public void processPayment() {
        System.out.println("UpiPaymentService");
    }
}
