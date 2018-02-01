package 工厂模式.简单工厂.Main;

import 工厂模式.简单工厂.Factory.NoodleFactory;
import 工厂模式.简单工厂.Factory.NoodleFactoryReflect;
import 工厂模式.简单工厂.INoodle.INoodle;
import 工厂模式.简单工厂.INoodle.Impl.Lamian;

public class Main {
    /**
     * 简单工厂或静态工厂
     * @param args
     */
    public static void main(String[] args) {
        /**
         * (非反射)使用者需知道工厂定义的字段代表什么含义
         */
        INoodle noodle = NoodleFactory.newInstance(NoodleFactory.NoodleFactory_DX);
        noodle.desc();
        /**
         * (反射)使用者需知道具体类
         */
        INoodle noodleReflect = NoodleFactoryReflect.newInstance(Lamian.class);
        noodleReflect.desc(); 
    }

}
