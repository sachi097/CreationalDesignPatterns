package com.learnings.builder;

public class UserManual {
    private String tyres;
    private String sportsEngine;
    private String seats;
    private String gps;

    UserManual(){
        this.sportsEngine = "This is a normal car";
        this.gps = "This car do not have GPS";
        this.seats = "This car has zero seats";
        this.tyres = "This car has zero tyres";
    }

    public void setSeats(int seats){
        this.seats = "This car has " + seats + " seats";
    }

    public void setTyres(int tyres){
        this.tyres = "This car has " + tyres + " tyres";
    }
    public void setSportsEngine(boolean bSportsEngine) {
        if(bSportsEngine) {
            this.sportsEngine = "This is a sports Car";
        }
    }

    public void setGps(boolean bGps) {
        if(bGps) {
            this.gps = "This car has GPS";
        }
    }

    public void displayCar(){
        System.out.println(this.seats);
        System.out.println(this.tyres);
        System.out.println(this.sportsEngine);
        System.out.println(this.gps);
    }
}
