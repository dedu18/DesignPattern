package 原型模式.基础;

public class Main {

    /**
     * 应用场景：
     *     一个类需要创建很多实例，这些实例内部成员差异不大而实例的创建开销较大或需要输入较多参数，这时如果能通过复制一个已创建的对象实例来重复创建多个相同的对象，就可减少创建对象的开销，这个时候就需要原型模式。
     *     在Java中，接口Cloneable已经提供了clone方法来实现这个想法，且每个Object对象的都有clone方法，这样就可直接重写此方法（需显示继承Cloneable,不能直接使用Object的clone方法，不然java.lang.CloneNotSupportedException,默认浅复制）。
     * @param args
     * @throws CloneNotSupportedException 
     */
    public static void main(String[] args) {
        PrototypeObject rawObj = new PrototypeObject("Tim", "1.0");
        System.out.println(rawObj.toString());
        
        Object obj = null;
        try {
            obj = (PrototypeObject) rawObj.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        rawObj.setName("Tom");
        rawObj.setVersion("2.0");
        System.out.println(rawObj.toString());
        System.out.println(obj.toString());
        
    }

}
