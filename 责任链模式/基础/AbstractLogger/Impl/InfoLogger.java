package 责任链模式.基础.AbstractLogger.Impl;

import 责任链模式.基础.AbstractLogger.AbstractLogger;
import 责任链模式.基础.Pojo.LoggerLevel;

public class InfoLogger extends AbstractLogger {

    
    
    public InfoLogger() {
        this.level = LoggerLevel.LOG_INFO.getLoggerLevel();
    }
    
    @Override
    protected void logMessage(String content) {
        // TODO Auto-generated method stub
        System.out.println("InfoLogger：" + content);
    }

}
