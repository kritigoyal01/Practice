package com.company.ChainofResponsibility;

public class MultuplyNumbers implements  Chain {
    public Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    //To multiply numbers if string passed is mult, otherwise wont do anything
    @Override
    public void calculate(Numbers req) {

        if(req.getCalwant()== "mult")
        {
            System.out.println("Multiply numbers");
            System.out.println(req.getNum1() * req.getNum2());
        }
        else
        {
            System.out.println("Only do add, mult or sub");
        }
    }
}
