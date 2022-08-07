package com.learnings.factoryclass;

public class CreateInvoiceFactory {
    public Invoice getInvoice(int invoiceType){
        switch (invoiceType){
            case 1: return new InvoiceWithHeader();
            case 2: return new InvoiceWithoutHeader();
        }
        return null;
    }
}
