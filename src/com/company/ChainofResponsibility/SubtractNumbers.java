package com.company.ChainofResponsibility;

public class SubtractNumbers implements  Chain{
    public Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    //To subtract two numbers if string matches with sub , otherwise forwaded to MultiplyNumbers class
    @Override
    public void calculate(Numbers req) {

        if(req.getCalwant()== "sub")
        {
            System.out.println("Subtract numbers");
            System.out.println(req.getNum1() - req.getNum2());
        }
        else
        {
            nextChain.calculate(req);
        }
    }
}
