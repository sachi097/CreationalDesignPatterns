package com.learnings.abstractfactory;

import java.util.Scanner;

public class FurnitureApp {
    public static void main(String[] args) throws Exception {
        boolean exit = false;
        int furnitureType;
        FurnitureFactory factory;
        System.out.println("Welcome to Happy Furnitures");
        while(!exit) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Furniture Type:");
            furnitureType = sc.nextInt();
            switch(furnitureType){
                case 1:
                    factory = new OldFactory();
                    break;
                case 2:
                    factory = new ModernFactory();
                    break;
                default: throw new Exception("Error! Unknown furniture");
            }
            DriverClass furniture = new DriverClass(factory);
            furniture.createChair();
            furniture.createTable();
        }
    }
}
