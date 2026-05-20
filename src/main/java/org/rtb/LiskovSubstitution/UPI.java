package org.rtb.LiskovSubstitution;

public class UPI implements IPayment{
    @Override
    public void pay() {
        System.out.println("UPI pay");
    }

    @Override
    public void refund() {
        System.out.println("UPI refund");
    }

    public void checkBalance() {
        System.out.println("UPI check balance");
    }
}
