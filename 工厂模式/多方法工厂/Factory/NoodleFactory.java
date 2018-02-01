package 工厂模式.多方法工厂.Factory;

import 工厂模式.多方法工厂.INoodle.INoodle;
import 工厂模式.多方法工厂.INoodle.Impl.Chaomian;
import 工厂模式.多方法工厂.INoodle.Impl.Huimian;

public class NoodleFactory {
    /**
     * 直接返回所需的类
     * @return
     */
    public static INoodle createHM() {
        return new Huimian();
    }
    
    public static INoodle createCM() {
        return new Chaomian();
    }
}
