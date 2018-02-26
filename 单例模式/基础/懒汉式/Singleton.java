package 单例模式.基础.懒汉式;

public class Singleton {
    /**
     * 首先将构造方法改成私有，防止被继承和被随意实例化。
     */
    private Singleton() {
    }
    
    /**
     * 饿汉式（非线程安全）：
     * 这里可以自己在内部访问上面的私有构造方法，然后在加载的时候就实例化一个静态对象，并提供下面的唯一访问接口。
     */
    public static Singleton instance;
    
    /**
     * 访问接口，先判断是否存在，若不存在则实例化。多个线程同时方式时，可能会实例化多个。
     * @return instance
     */
    public static Singleton getInstance() {
        if (null == instance) {
            instance = new Singleton();
        }
        return instance;
    }
}
