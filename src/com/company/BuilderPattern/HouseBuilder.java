package com.company.BuilderPattern;

//Implements by different Housebuilders
public interface HouseBuilder {

        void buildBasement();
        void buildStructure();
        void buildRoof();
        void buildInterior();
        House getHouse();
}
