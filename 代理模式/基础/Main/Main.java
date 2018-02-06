package 代理模式.基础.Main;

import java.lang.reflect.Proxy;

import 代理模式.基础.JDK.StarHandler;
import 代理模式.基础.静态代理.IStar;
import 代理模式.基础.静态代理.StarProxy;
import 代理模式.基础.静态代理.StarReal;

public class Main {
    /**
     * 代理模式和装饰者模式都属于结构型设计模式，代理如经纪人和艺人的关系，外界想要联系艺人需先联系经纪人然后间接访问艺人
     * 这样代理就可以为被委派的对象提供访问控制，常见使用情景如：远程代理（Remote Proxy）、虚代理（Virtual Proxy）、保护代理（Protection Proxy）和智能指引（Smart Reference）
     * Java中有三类常见代理：静态代理、动态代理（又分JDK自带动态代理和CGLIB）
     * 参考：https://www.cnblogs.com/meet/p/5116464.html
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 静态代理必须有代理类Proxy
         */
//        IStar star = new StarReal();
//        StarProxy proxy = new StarProxy(star);
//        proxy.sing();
        
        /**
         * JDK代理
         * 1、 obj.getClass().getClassLoader()目标对象通过getClass方法获取类的所有信息后，调用getClassLoader()
         *    方法来获取类加载器。获取类加载器后，可以通过这个类型的加载器，在程序运行时，将生成的代理类加载到JVM即Java虚拟机中，以便运行时需要！
         * 2、obj.getClass().getInterfaces()获取被代理类的所有接口信息，以便于生成的代理类可以具有代理类接口中的所有方法。
         * 3、this：我们使用动态代理是为了更好的扩展，比如在方法之前做什么，之后做什么等操作。这个时候这些公共的操作可以统一交给代理类去做。
         */
                代理模式.基础.JDK.IStar star2 = new 代理模式.基础.JDK.StarReal();
        StarHandler handler = new StarHandler(star2);
                代理模式.基础.JDK.IStar proxy2 = (代理模式.基础.JDK.IStar) Proxy.newProxyInstance(star2.getClass().getClassLoader(), star2.getClass().getInterfaces(), handler);
        proxy2.sing();
    }

}
