package com.company.factoryDesignPattern;

public class vehicleMain {


    public static void main(String[] args){
        factoryClass fobj = new factoryClass();
        Vehicle  vehicle = fobj.createVehicleMain(1);
        vehicle.printDetails();


    }
}
