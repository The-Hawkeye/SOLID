package org.rtb.LiskovSubstitution;

public interface IPayment extends NonRefundablePayment {
//    public void pay();
    public void refund();
}
