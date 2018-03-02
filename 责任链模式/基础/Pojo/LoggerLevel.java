package 责任链模式.基础.Pojo;

public enum LoggerLevel {
    /**
     * INFO模式输出.
     */
    LOG_INFO("1"), 
    /**
     * DEBUG模式输出.
     */
    LOG_DEBUG("2"), 
    /**
     * ERROR模式输出.
     */
    LOG_ERROR("3");
    private String LoggerLevel;

    public String getLoggerLevel() {
        return LoggerLevel;
    }

    public void setLoggerLevel(String loggerLevel) {
        LoggerLevel = loggerLevel;
    }
    /**
     * 私有化构造方法，代码实例化一个枚举对象
     * @param loggerLevel Logger模式
     */
    private LoggerLevel(String loggerLevel) {
        LoggerLevel = loggerLevel;
    }
    
}
