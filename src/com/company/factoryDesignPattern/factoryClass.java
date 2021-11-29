package com.company.factoryDesignPattern;

public class factoryClass {
    private Vehicle vehicle;

    //Method to check which type of Vehicle object to be created
    public Vehicle createVehicleMain(int type) {
        if(type == 1){
            vehicle = new TwoWheeler();
        }
        else if(type == 2){
            vehicle = new FourWheeler();
        }
        else{
            vehicle = null;
        }
        return vehicle;
    }
}
