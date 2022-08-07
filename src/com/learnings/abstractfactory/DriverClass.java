package com.learnings.abstractfactory;

public class DriverClass {
    private FurnitureFactory furniture;
    DriverClass(FurnitureFactory furniture){
        this.furniture = furniture;
    }

    void createChair(){
        Chair chair = this.furniture.createChair();
        chair.hasLegs();
        chair.sitOn();
    }

    void createTable(){
        Table table = this.furniture.createTable();
        table.hasLegs();
        table.sitOn();
    }
}
