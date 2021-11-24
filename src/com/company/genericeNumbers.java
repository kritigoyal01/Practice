package com.company;

public class genericeNumbers <T extends Number>{
    public double addNumbers(T one, T two){
        return one.doubleValue() + two.doubleValue();
    }
}
