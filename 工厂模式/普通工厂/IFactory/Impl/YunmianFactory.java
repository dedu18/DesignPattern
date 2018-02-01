package 工厂模式.普通工厂.IFactory.Impl;

import 工厂模式.普通工厂.IFactory.IFactory;
import 工厂模式.普通工厂.INoodle.INoodle;
import 工厂模式.普通工厂.INoodle.Impl.Yunmian;

public class YunmianFactory extends IFactory {

    @Override
    public INoodle createNoodle() {
        // TODO Auto-generated method stub
        return new Yunmian();
    }

}
