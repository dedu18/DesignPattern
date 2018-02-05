package 装饰者模式.基础;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Main {
    /**
     * Decorator模式的工作原理是：可以创建始于Decorator对象（负责新的功能的对象）终于原对象的一个对象“链”。
     * 装饰者模式隐含的是通过一条条装饰链去实现具体对象，每一条装饰链都始于一个Componet对象，每个装饰者对象后面紧跟着另一个装饰者对象，而对象链终于ConcreteComponet对象。 
     * JAVA中IO流的设计就大量运用了装饰模式，如：
     * BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("...")));
     * BufferedReader和InputStreamReader有共同的基类Reader，BufferedReader中保存了Reader的成员变量。
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("-----装饰之前-----");
        ContreteComponment contrete = new ContreteComponment();
        contrete.operation();
        System.out.println("-----装饰之后-----");
        Component component = new ContreteComponentA(contrete);
        component.operation();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("...")));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
