package 命令模式.基础.ICommand.Impl;

import 命令模式.基础.ICommand.ICommand;
import 命令模式.基础.IReceiver.IReceiver;

public class CommandB extends ICommand {

    private IReceiver receiver;
    
    @Override
    public void exe() {
        // TODO Auto-generated method stub
        receiver.doThing();
    }

}
