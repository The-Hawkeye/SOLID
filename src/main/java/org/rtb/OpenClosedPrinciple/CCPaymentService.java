package org.rtb.OpenClosedPrinciple;

public class CCPaymentService implements IPaymentService {
    @Override
    public void processPayment() {
        System.out.println("CCPaymentService");
    }
}
