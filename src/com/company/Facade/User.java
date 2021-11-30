package com.company.Facade;

public class User {
    public static void main (String[] args) {
        HotelKeeper keeper = new HotelKeeper();
        keeper.nonVegRes();
        keeper.vegRes();
    }
}
