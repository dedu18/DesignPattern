package 策略模式.基础.IPrice.Impl;

import 策略模式.基础.IPrice.IPrice;

public class VipPrice implements IPrice {

    @Override
    public double getPrice(double orign) {
        // TODO Auto-generated method stub
        return orign * 0.85;
    }

}
