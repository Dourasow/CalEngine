package com.Cal;

public class Divider extends CalculateBase{
    @Override
    public void Calculate() {
        double value = getLefVal() / getRightVal();
        setResult(value);
    }

}
