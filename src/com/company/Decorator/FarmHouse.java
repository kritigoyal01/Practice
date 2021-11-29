package com.company.Decorator;

class FarmHouse extends Pizza {
    public FarmHouse() {
        description = "FarmHouse";
    }

    public int getCost() {
        return 200;
    }
}
