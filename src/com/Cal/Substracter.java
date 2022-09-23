package com.Cal;

public class Substracter extends CalculateBase{
    @Override
    public void Calculate() {
        double value = getLefVal() - getRightVal();
        setResult(value);
    }
}
