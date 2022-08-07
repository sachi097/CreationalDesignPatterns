package com.learnings.builder;

public class VehicleBuilderDirector {
    private VehicleBuilder vehicleBuilder;
    void setVehicleBuilder(VehicleBuilder builder){
        this.vehicleBuilder = builder;
    }
    void constructNormalCar(){
        this.vehicleBuilder.buildSeats(4);
        this.vehicleBuilder.buildTyres(4);
        this.vehicleBuilder.buildSportsEngine(false);
        this.vehicleBuilder.buildGps(true);
    }
    void constructNormalCarUserManual(){
        this.vehicleBuilder.buildSeats(4);
        this.vehicleBuilder.buildTyres(4);
        this.vehicleBuilder.buildSportsEngine(false);
        this.vehicleBuilder.buildGps(true);
    }
}
