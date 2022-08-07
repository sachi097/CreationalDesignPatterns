package com.learnings.factoryclass;

import java.util.Scanner;

public class InvoiceApp {
    public static void main(String[] args) {
        boolean exit = false;
        int invoiceType;
        Invoice invoiceObject;
        CreateInvoiceFactory invoiceFactory = new CreateInvoiceFactory();
        System.out.println("Welcome to Happy Invoice");
        while(!exit) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Invoice Type:");
            invoiceType = sc.nextInt();
            invoiceObject = invoiceFactory.getInvoice(invoiceType);
            try {
                invoiceObject.printInvoice();
            }catch(Exception error){
                System.out.println("Thank You for Using Happy Invoice");
                break;
            }
        }
    }
}
