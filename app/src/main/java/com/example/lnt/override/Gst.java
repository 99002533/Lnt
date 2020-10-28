package com.example.lnt.override;

public class Gst extends IncomeTax{
    @Override
    public int calculateTax(int income) {
        int oldTax = super.calculateTax(income);
        int gst = oldTax + 15;
        return gst;
    }

}
