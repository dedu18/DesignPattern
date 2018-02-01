package 工厂模式.简单工厂.Factory;

import 工厂模式.简单工厂.INoodle.INoodle;
import 工厂模式.简单工厂.INoodle.Impl.Daoxiao;
import 工厂模式.简单工厂.INoodle.Impl.Lamian;

public class NoodleFactory {
    /**
     * 定义不同对象的标识字段，使用者需知道此字段代表的含义
     */
    public static final int NoodleFactory_DX = 1;
    public static final int NoodleFactory_LM = 2;
    
    /**
     * 根据字段来实现对应的类并以多态形式返回
     * @param type 标识
     * @return 父类
     */
    public static INoodle newInstance(int type) {
        INoodle noodle = null;
        switch (type) {
        case NoodleFactory_DX:
            noodle = new Daoxiao();break;
        case NoodleFactory_LM:
            noodle = new Lamian();break;
        default:
            noodle = new Daoxiao();break;
        }
        return noodle;
    }
}
