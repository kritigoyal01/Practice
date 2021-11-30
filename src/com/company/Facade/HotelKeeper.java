package com.company.Facade;

public class HotelKeeper {
private VegRes vr;
private NonVegRes nvr;

    public HotelKeeper() {
        vr = new VegRes();
       nvr = new NonVegRes();
    }

    public void vegRes(){
        vr.getResDetails();
    }
    public void nonVegRes(){
        nvr.getResDetails();
    }
}
