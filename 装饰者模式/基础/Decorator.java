package 装饰者模式.基础;

public abstract class Decorator extends Component {
    /**
     * 装饰基类，这里使用父类Component保存了一个对被装饰者的引用，以便对它进行装饰；
     * 持有一个构件（Component）对象的实例，并实现一个与抽象构件接口一致的接口。
     */
    protected Component contreteComponent;

    public Decorator(Component contreteComponent) {
        super();
        this.contreteComponent = contreteComponent;
    }
    
}
