package 单例模式.基础.饿汉式;

public class Singleton {
    /**
     * 首先将构造方法改成私有，防止被继承和被随意实例化。
     */
    private Singleton() {
    }
    
    /**
     * 饿汉式（线程安全）：
     * 这里可以自己在内部访问上面的私有构造方法，然后在加载的时候就实例化一个静态对象，并提供下面的唯一访问接口。
     * 由于每次都会实例化一个static变量，所以可能只访问该类中其他static方法，但仍会实例化instance。
     */
    public static Singleton instance = new Singleton();
    
    /**
     * 访问接口
     * @return instance
     */
    public static Singleton getInstance() {
        return instance;
    }
}
