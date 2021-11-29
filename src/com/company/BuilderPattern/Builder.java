package com.company.BuilderPattern;

//Main class to make the House object with the use of other simpler objects
public class Builder
    {
        public static void main(String[] args) {
            HouseBuilder iglooBuilder = new IglooHouseBuilder();
            CivilEngineer engineer = new CivilEngineer(iglooBuilder);

            engineer.constructHouse();

            House house = engineer.getHouse();

            System.out.println("Builder constructed:\n" + house.getBasement() + "\n" + house.getInterior() + "\n" + house.getRoof() + "\n" + house.getStructure());
        }
}
