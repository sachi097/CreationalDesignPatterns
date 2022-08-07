package com.learnings.builder;

public class CarBuilderApp {
    public static void main(String[] args) {
        VehicleBuilderDirector vehicleBuilderDirector = new VehicleBuilderDirector();
        //Build Car
        CarBuilder carBuilder = new CarBuilder();
        vehicleBuilderDirector.setVehicleBuilder(carBuilder);
        vehicleBuilderDirector.constructNormalCar();
        Car car = carBuilder.getProduct();
        car.displayCar();
        //Build UserManual;
        UserManualBuider userManualBuider = new UserManualBuider();
        vehicleBuilderDirector.setVehicleBuilder(userManualBuider);
        vehicleBuilderDirector.constructNormalCarUserManual();
        UserManual userManual = userManualBuider.getProduct();
        userManual.displayCar();

    }
}
