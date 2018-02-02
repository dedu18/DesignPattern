package 策略模式.基础.Buyer;

import 策略模式.基础.IPrice.IPrice;
import 策略模式.基础.IPrice.Impl.RawPrice;
import 策略模式.基础.IPrice.Impl.VipPrice;

public class Buyer {
    private boolean isVip = false;
    /**
     * 持有一个具体策略的对象
     */
    private IPrice price;
    
    /**
     * 多态，根据不同的策略参数生成不同的策略
     * @param isVip
     */
    public Buyer(boolean isVip) {
        this.isVip = isVip;
        if (isVip) {
            price = new VipPrice();
        } else {
            price = new RawPrice();
        }
    }
    
    public double pay(double payMoney) {
        return price.getPrice(payMoney);
    }
}
