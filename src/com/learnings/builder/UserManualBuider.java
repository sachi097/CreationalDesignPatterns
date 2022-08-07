package com.learnings.builder;

public class UserManualBuider implements VehicleBuilder{

    UserManual userManual;

    UserManualBuider(){
        this.reset();
    }
    @Override
    public void reset() {
        this.userManual = new UserManual();
    }

    @Override
    public void buildSeats(int seats) {
        this.userManual.setSeats(seats);
    }

    @Override
    public void buildSportsEngine(boolean bSportsEngine) {
        this.userManual.setSportsEngine(bSportsEngine);
    }

    @Override
    public void buildTyres(int tyres) {
        this.userManual.setTyres(tyres);
    }

    @Override
    public void buildGps(boolean bGps) {
        this.userManual.setGps(bGps);
    }

    UserManual getProduct(){
        UserManual product = this.userManual;
        this.reset();
        return product;
    }
}
