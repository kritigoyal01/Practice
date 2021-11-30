package com.company.ChainofResponsibility;

public class User {
    public static void main(String[] args) {

        Chain c1 = new AddNumbers();
        Chain c2 = new SubtractNumbers();
        Chain c3 = new MultuplyNumbers();

        Numbers n1 = new Numbers(2, 3, "add");
        Numbers n2 = new Numbers(2, 3, "sub");
        Numbers n3 = new Numbers(2, 3, "mult");
        Numbers n4 = new Numbers(2, 3, "div");

        //Chain of objects
        c1.setNextChain(c2);
        c2.setNextChain(c3);

        //add two numbers
        c1.calculate(n1);

        //sub two numbers
        c1.calculate(n2);

        //multiply
        c1.calculate(n3);

        //Give error statement
        c1.calculate(n4);
    }
}
