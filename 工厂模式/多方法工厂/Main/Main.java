package 工厂模式.多方法工厂.Main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import 工厂模式.多方法工厂.Factory.NoodleFactory;
import 工厂模式.多方法工厂.INoodle.INoodle;

public class Main {
    /**
     * 需要什么具体实现类就调用相应的static方法，类似于Executors创建ExecutorService的方式
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        INoodle noodle = NoodleFactory.createHM();
        noodle.desc();
        
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Runnable threadR = new Runnable() {
            
            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("**");
            }
        };
        executorService.execute(threadR);
    }

}
