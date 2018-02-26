package 单例模式.基础.静态内部类;

public class Singleton {
    /**
     * 首先将构造方法改成私有，防止被继承和被随意实例化。
     */
    private Singleton() {
    }
    
    private static class SingletonHelper {
        public static Singleton instance = new Singleton();
    }
    
    /**
     * 静态内部类式（线程安全，饿汉式改进版）：
     * 访问接口，只有在访问该方法时才会实例化instance
     * @return instance
     */
    public static Singleton getInstance() {
        return SingletonHelper.instance;
    }
}
