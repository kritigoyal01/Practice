package com.company.ChainofResponsibility;

//Two numbers and string to wat to do with the numbers

public class Numbers {
    private int num1;
    private int num2;
    private String calwant;

    //Constructor
    public Numbers(int num1, int num2, String calwant) {
        this.num1 = num1;
        this.num2 = num2;
        this.calwant = calwant;
    }


//getter
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getCalwant() {
        return calwant;
    }
}
