package com.company.ChainofResponsibility;

//implements by AddNumbers, Multiply, SubtractNumbers
public interface Chain {
    public void setNextChain (Chain chain);
    public void calculate (Numbers req);
}
