package 命令模式.基础.ICommand.Impl;

import 命令模式.基础.ICommand.ICommand;
import 命令模式.基础.IReceiver.IReceiver;

/**
 * 实现接口ICommand，填充具体命令
 * @author dedu
 *
 */
public class CommandA extends ICommand {

    /**
     * 设置具体执行命令的对象
     */
    private IReceiver receiver;
    
    public CommandA(IReceiver receiver) {
        super();
        this.receiver = receiver;
    }

    public void setReceiver(IReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        /**
         * 调用对象执行命令
         */
        receiver.doThing();
    }

}
