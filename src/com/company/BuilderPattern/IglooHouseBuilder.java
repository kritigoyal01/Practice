package com.company.BuilderPattern;

public class IglooHouseBuilder implements HouseBuilder{
    private House house;

    //constructor
    public IglooHouseBuilder()
    {
        this.house = new House();
    }

    public void buildBasement()
    {
        System.out.println("Build Igloo basement");
        house.setBasement("Ice Bars");
    }

    public void buildStructure()
    {
        System.out.println("Build igloo structure");
        house.setStructure("Ice Blocks");
    }

    public void buildInterior()
    {
        System.out.println("Build Igloo Interior");
        house.setInterior("Ice Carvings");
    }

    public void buildRoof()
    {
        System.out.println("Build igloo Roof");
        house.setRoof("Ice Dome");
    }

    public House getHouse()
    {
        return this.house;
    }
}
