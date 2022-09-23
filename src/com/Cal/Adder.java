package com.Cal;

public class Adder extends CalculateBase{
    @Override
    public void Calculate() {
        double value = getLefVal() + getRightVal();
        setResult(value);
    }
}
