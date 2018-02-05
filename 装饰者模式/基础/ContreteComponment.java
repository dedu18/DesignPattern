package 装饰者模式.基础;

public class ContreteComponment extends Component{
    /**
     * 具体类、被装饰类：包含了最基础的需求，是一个待动态扩展的类。
     */
     public void operation() {
         System.out.println("*****最原始的类*****");
     }
}
