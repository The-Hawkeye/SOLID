package org.rtb.OpenClosedPrinciple;

public class PaymentService {
    public void processPayment(String type){
        if(type.equals("UPI")){
            System.out.println("Payment through upi");
        } else if(type.equals("CC")){
            System.out.println("Payment through CC");
        } else if (type.equals("BCC")) {
            System.out.println("Payment through BCC");
        }
    }
}


// This is wrong as we are updating existing tested code