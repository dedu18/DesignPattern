package 命令模式.基础.IReceiver.Impl;

import 命令模式.基础.IReceiver.IReceiver;

/**
 * 真实执行命令的对象
 * @author dedu
 *
 */
public class ReceiverA extends IReceiver{

    @Override
    public void doThing() {
        System.out.println("A: I am doing thing..");
    }

}
