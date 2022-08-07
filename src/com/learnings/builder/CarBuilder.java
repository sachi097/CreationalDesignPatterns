package com.learnings.builder;

public class CarBuilder implements VehicleBuilder{

    private Car car;

    CarBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void buildSeats(int seats) {
        this.car.setSeats(seats);
    }

    @Override
    public void buildSportsEngine(boolean bSportsEngine) {
        this.car.setSportsEngine(bSportsEngine);
    }

    @Override
    public void buildTyres(int tyres) {
    this.car.setTyres(tyres);
    }

    @Override
    public void buildGps(boolean bGps) {
        this.car.setGps(bGps);
    }

    Car getProduct(){
        Car product = this.car;
        this.reset();
        return product;
    }
}
