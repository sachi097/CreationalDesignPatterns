package com.learnings.factoryclass;

public class InvoiceWithHeader implements Invoice {
    InvoiceWithHeader() {
        System.out.println("Invoice with Header is Created");
    }
    @Override
    public void printInvoice() {
        System.out.println("Printing Invoice with Header");
    }
}
