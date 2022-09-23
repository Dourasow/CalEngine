package com.Cal;

public class Multiplier extends CalculateBase{
    @Override
    public void Calculate() {
        double value = getLefVal() * getRightVal();
        setResult(value);
    }
}
