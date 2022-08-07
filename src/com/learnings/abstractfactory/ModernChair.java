package com.learnings.abstractfactory;

public class ModernChair implements Chair{
    @Override
    public void hasLegs() {
        System.out.println("Modern Chair has four legs");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sleep on Modern Chair");
    }
}
