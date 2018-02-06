package 代理模式.基础.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
    
    private IStar starReal;
    
    /**
     * 仅支持interface代理（也就是代理类必须实现接口）
     * 1、Object proxy : 生成的代理对象。
     * 2、Method method：被代理的对象中被代理的方法的一个抽象。
     * 3、Object[] args：被代理方法中的参数。
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;
        System.out.println("*****JDK Proxy处理前*****");
        if (method.getName().equals("sing")) {
            //激活调用的方法
            obj = method.invoke(starReal, args);
        }
        System.out.println("*****JDK Proxy处理后*****");
        return obj;
    }

    public StarHandler(IStar starReal) {
        super();
        this.starReal = starReal;
    }

}
