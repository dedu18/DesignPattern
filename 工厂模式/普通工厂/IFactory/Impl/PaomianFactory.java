package 工厂模式.普通工厂.IFactory.Impl;

import 工厂模式.普通工厂.IFactory.IFactory;
import 工厂模式.普通工厂.INoodle.INoodle;
import 工厂模式.普通工厂.INoodle.Impl.Paomian;

public class PaomianFactory extends IFactory {

    @Override
    public INoodle createNoodle() {
        // TODO Auto-generated method stub
        return new Paomian() ;
    }

}
