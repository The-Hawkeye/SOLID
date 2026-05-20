package org.rtb.InterfaceSegregationPrinciple;

public class QAEng implements Employee{
    @Override
    public void writeCode() {
        System.out.println("writeCode");
    }

    @Override
    public void testCode() {
        System.out.println("testCode");
    }

    @Override
    public void deployCode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
