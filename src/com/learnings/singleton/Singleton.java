package com.learnings.singleton;

public class Singleton {
    public static Singleton singletonObj;

    private Singleton(){}

    public static Singleton getObject(){
        if(singletonObj == null){
            synchronized (Singleton.class){
                if(singletonObj == null){
                    singletonObj = new Singleton();
                    System.out.println("Created Object Now!");
                }
            }
        }
        else{
            System.out.println("Use Cached Object");
        }
        return singletonObj;
    }
}
