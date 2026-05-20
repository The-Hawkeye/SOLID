package org.rtb.LiskovSubstitution;

public class Crypto implements NonRefundablePayment{
    @Override
    public void pay() {
        System.out.println("Crypto pay");
    }

//    @Override
//    public void refund() {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
}
