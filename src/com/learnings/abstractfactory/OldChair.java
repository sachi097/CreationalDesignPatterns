package com.learnings.abstractfactory;

public class OldChair implements Chair{
    @Override
    public void hasLegs() {
        System.out.println("Old Chair has four legs");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit on Old Chair");
    }
}
