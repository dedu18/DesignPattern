package 单例模式.基础.双重检测;

import java.util.concurrent.locks.Lock;

public class Singleton {
    /**
     * 首先将构造方法改成私有，防止被继承和被随意实例化。
     */
    private Singleton() {
    }
    
    private static Object obj = new Object();
    
    /**
     * 双重检测（线程安全）：
     * 这里可以自己在内部访问上面的私有构造方法，提供下面的唯一访问接口。
     */
    public static Singleton instance;
    
    /**
     * 访问接口，先判断是否存在，若不存在则实例化。由于有锁锁住实例化时的代码块，并且二次判断
     * @return instance
     */
    public static Singleton getInstance() {
        if (null == instance) {
            synchronized (obj) {
                if (null == instance) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
