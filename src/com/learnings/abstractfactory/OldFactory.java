package com.learnings.abstractfactory;

public class OldFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new OldChair();
    }

    @Override
    public Table createTable() {
         return new OldTable();
    }
}
