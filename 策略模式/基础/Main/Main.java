package 策略模式.基础.Main;

import 策略模式.基础.Buyer.Buyer;

public class Main {

    /**
     * 策略模式和工厂模式类似，都是面向对象多态的应用：如简单工厂，是将一种产品
     * 标识传入工厂，工厂返回对应的产品对象；而策略模式是根据不同的策略对象产生不同的算法再返回。
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Buyer buyer = new Buyer(true);
        double pay = buyer.pay(100);
        System.out.println(pay);
    }

}
