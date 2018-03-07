package 命令模式.基础;

import 命令模式.基础.ICommand.ICommand;

/**
 * 调用者，直接和Client交互的对象
 * @author dedu
 *
 */
public class Invoker {

    /**
     * 要执行的命令
     */
    private ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }
    
    public void action() {
        if (null != command) {
            this.command.exe();
        }
    }
    
}
