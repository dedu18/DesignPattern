package 命令模式.基础;

import 命令模式.基础.ICommand.ICommand;
import 命令模式.基础.ICommand.Impl.CommandA;
import 命令模式.基础.IReceiver.IReceiver;
import 命令模式.基础.IReceiver.Impl.ReceiverA;
import 命令模式.基础.IReceiver.Impl.ReceiverB;

public class Main {
    /**
     * 命令模式：（行为型设计模式）
     *     将一个请求封装成一个对象，从而使用不同的请求把客户端参数化，对请求排队或者记录请求日志，另可以提供命令的撤销和恢复功能。
     * 优点：①类解耦：调用者和接受者之间没有任何依赖，如在餐馆吃饭时，客户不必了解厨师如何做，只需和服务员点餐即可。
     *      ②可扩展：命令基类可扩展多个命令，各命令间无影响，调用者没有代码耦合。
     * @param args
     */
    public static void main(String[] args) {
        /**
         * ①新建调用者Invoker
         */
        Invoker invoker = new Invoker();
        /**
         * ④新建具体执行命令者IReceiver
         */
        //IReceiver receiver = new ReceiverB();
        IReceiver receiver = new ReceiverA();
        /**
         * ③新建命令ICommand，设置执行命令者
         */
        ICommand command = new CommandA(receiver);
        /**
         * ②调用者设置命令
         */
        invoker.setCommand(command);
        /**
         * ⑤发起命令
         */
        invoker.action();
    }

}
