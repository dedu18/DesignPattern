package 工厂模式.普通工厂.Main;

import 工厂模式.普通工厂.IFactory.IFactory;
import 工厂模式.普通工厂.IFactory.Impl.PaomianFactory;
import 工厂模式.普通工厂.INoodle.INoodle;

public class Main {

    /**
     * 普通工厂是把上面简单工厂中具体的工厂类，
     * 划分成两层：抽象工厂层+具体的工厂子类层
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        IFactory factory = new PaomianFactory();
        INoodle noodle = factory.createNoodle();
        noodle.desc();
    }

}
