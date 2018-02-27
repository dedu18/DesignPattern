package 适配器模式.基础;

import 适配器模式.基础.对象适配器.Client;
import 适配器模式.基础.对象适配器.Real;
import 适配器模式.基础.对象适配器.RealAdapter;

public class Main {

    /**
     * 应用场景：（结构型设计模式）
     *     适配器模式将某个类的接口转换成客户端期望的另一个接口表示，主的目的是兼容性，让原本因接口不匹配不能一起工作的两个类可以协同工作。
     *     是一种既成事实的情况下的补救措施。别名为包装器(Wrapper)。
     * 分类：类适配器模式、对象的适配器模式（常用）、接口的适配器模式
     * @param args args
     */
    public static void main(String[] args) {
        Real real = new Real();
        RealAdapter adapter = new RealAdapter(real);
        int hole = adapter.getHole();
        System.out.println(hole);
    }
}
