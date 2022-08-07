package com.learnings.builder;

public class Car {
    private int tyres;
    private boolean sportsEngine;
    private int seats;
    private boolean gps;

    Car(){
        this.sportsEngine = false;
        this.gps = false;
        this.seats = 0;
        this.tyres = 0;
    }

    public void setSeats(int seats){
        this.seats = seats;
    }

    public void setTyres(int tyres){
        this.tyres = tyres;
    }
    public void setSportsEngine(boolean bSportsEngine) {
        this.sportsEngine = bSportsEngine;
    }

    public void setGps(boolean bGps) {
        this.gps = bGps;
    }

    public void displayCar(){
        System.out.println("Seats : " + this.seats);
        System.out.println("Tyres : " + this.tyres);
        System.out.println("Sports Car: " + this.sportsEngine);
        System.out.println("GPS System: " + this.gps);
    }
}
