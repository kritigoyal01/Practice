package com.company.ChainofResponsibility;

public class AddNumbers implements Chain {
    public Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers req) {

        if(req.getCalwant()== "add")
        {
            System.out.println("Add numbers");
            System.out.println(req.getNum1() + req.getNum2());
        }
        else
        {
           nextChain.calculate(req);
        }
    }

}
