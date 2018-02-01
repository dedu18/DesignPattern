package 工厂模式.抽象工厂.IFactory.Impl;

import 工厂模式.抽象工厂.IFactory.IFactory;
import 工厂模式.抽象工厂.IFood.IDrink.IDrink;
import 工厂模式.抽象工厂.IFood.IDrink.Impl.Kele;
import 工厂模式.抽象工厂.IFood.INoodle.INoodle;
import 工厂模式.抽象工厂.IFood.INoodle.Impl.Paomian;

public class KFCFactory extends IFactory {

    @Override
    public IDrink drink() {
        // TODO Auto-generated method stub
        return new Kele();
    }

    @Override
    public INoodle noodle() {
        // TODO Auto-generated method stub
        return new Paomian();
    }

}
