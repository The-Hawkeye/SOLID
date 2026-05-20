package org.rtb.InterfaceSegregationPrinciple;

public class DevOpsEng implements Employee{
    @Override
    public void writeCode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void testCode() {
        System.out.println("testCode");
    }

    @Override
    public void deployCode() {
        System.out.println("deployCode");
    }
}
