package 代理模式.基础.静态代理;

public class StarProxy implements IStar {
    /**
     * 这里有一个对被代理类的引用
     */
    private IStar star;
    
    public StarProxy(IStar star) {
        super();
        this.star = star;
    }

    /**
     * 在被代理类实际的方法前后可根据需要增加其他处理
     */
    @Override
    public void sing() {
        System.out.println("*****处理前*****");
        star.sing();
        System.out.println("*****处理后*****");
    }

}
