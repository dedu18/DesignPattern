package 责任链模式.基础.AbstractLogger;

public abstract class AbstractLogger {
    /**
     * 日志记录器模式
     */
    protected String level;
    
    /**
     * 责任链中的下一个处理对象
     */
    protected AbstractLogger nextLogger;
    
    
    public AbstractLogger getNextLogger() {
        return nextLogger;
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(String level, String message) {
        if (this.level.equals(level)) {
            logMessage(message);
        } else if (null != nextLogger) {
            nextLogger.log(level, message);
        } else {
            throw new NullPointerException("No Logger found!");
        }
    }
    
    abstract protected void logMessage(String content);
}
