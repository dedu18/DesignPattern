package 命令模式.基础.IReceiver.Impl;

import 命令模式.基础.IReceiver.IReceiver;

public class ReceiverB extends IReceiver{

    @Override
    public void doThing() {
        System.out.println("B: I am doing thing..");
    }

}
