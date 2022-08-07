package com.learnings.singleton;

public class Client {
    public static void main(String[] args) {
        Singleton.getObject();
        Singleton.getObject();
        Singleton.getObject();
    }
}
