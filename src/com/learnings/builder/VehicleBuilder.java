package com.learnings.builder;

public interface VehicleBuilder {
    void reset();
    void buildSeats(int seats);
    void buildSportsEngine(boolean bSportsEngine);
    void buildTyres(int tyres);
    void buildGps(boolean bGps);
}
