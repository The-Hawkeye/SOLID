package org.rtb.LiskovSubstitution;

public class CreditCard implements IPayment{
    @Override
    public void pay() {
        System.out.println("CC pay");
    }

    @Override
    public void refund() {
        System.out.println("CC refund");
    }
}
