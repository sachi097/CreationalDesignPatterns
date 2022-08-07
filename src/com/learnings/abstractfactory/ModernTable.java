package com.learnings.abstractfactory;

public class ModernTable implements Table{
    @Override
    public void hasLegs() {
        System.out.println("Modern Table has four legs");
    }

    @Override
    public void sitOn() {
        System.out.println("You can keep books on Modern Table");
    }
}
