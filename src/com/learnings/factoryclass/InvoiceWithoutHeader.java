package com.learnings.factoryclass;

public class InvoiceWithoutHeader implements Invoice {
    InvoiceWithoutHeader() {
        System.out.println("Invoice without Header is Created");
    }
    @Override
    public void printInvoice() {
        System.out.println("Printing Invoice without Header");
    }
}
