package 工厂模式.抽象工厂.Main;

import 工厂模式.抽象工厂.IFactory.IFactory;
import 工厂模式.抽象工厂.IFactory.Impl.KFCFactory;
import 工厂模式.抽象工厂.IFood.IDrink.IDrink;
import 工厂模式.抽象工厂.IFood.INoodle.INoodle;

public class Main {

    /**
     * 简单工厂、普通工厂都是针对单一类进行的封装，而抽象工厂因为将工厂进行了抽象，因此可以对多个类进行封装
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        IFactory factory = new KFCFactory();
        IDrink drink = factory.drink();
        INoodle noodle = factory.noodle();
        drink.drink();
        noodle.noodle();
    }

}
