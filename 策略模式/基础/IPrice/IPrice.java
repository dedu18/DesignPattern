package 策略模式.基础.IPrice;

public interface IPrice {
    /**
     * 策略的抽象类，每个实现者都代表了一种策略
     * @param orign 原始价格
     * @return 策略使用后的价格
     */
    double getPrice(double orign);
}
