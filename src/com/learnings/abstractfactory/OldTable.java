package com.learnings.abstractfactory;

public class OldTable implements Table{
    @Override
    public void hasLegs() {
        System.out.println("Old Table has four legs");
    }

    @Override
    public void sitOn() {
        System.out.println("You can keep clothes on Old Table");
    }
}
