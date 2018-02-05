package 装饰者模式.基础;

public class ContreteComponentA extends Decorator {
    /**
     * 这是具体的某种装饰实现类，通过构造函数把被装饰者传递给父类构造，在重载方法中实现具体装饰
     * 注意：这里有一个继承的成员变量contreteComponent，是在基类Decorator中声明的！
     * @param contreteComponent
     */
    public ContreteComponentA(Component contreteComponent) {
        super(contreteComponent);
    }

    @Override
    public void operation() {
        contreteComponent.operation();
        System.out.println("*****追加装饰A*****");
    }

}
