package 责任链模式.基础;

import 责任链模式.基础.AbstractLogger.AbstractLogger;
import 责任链模式.基础.AbstractLogger.Impl.DebugLogger;
import 责任链模式.基础.AbstractLogger.Impl.ErrorLogger;
import 责任链模式.基础.AbstractLogger.Impl.InfoLogger;
import 责任链模式.基础.Pojo.LoggerLevel;

public class Main {

    /**
     * 应用场景：（行为型设计模式）
     *     责任链模式为请求对象创建了一个接受对象组成的链，每个对象都有可能进行处理这个请求，否则传递给链上的下一个对象，直到与对象处理。
     * 这样解耦了请求对象和处理对象的捆绑。
     *     
     * Java常见场景：Servlet的Filter(必须执行doFilter()的原因)
     * @param args args
     */
    public static void main(String[] args) {
        AbstractLogger logger = getLogger();
        /**
         * 这里每个Level只输出属于自己范围的信息，互不影响。
         */
        logger.log(LoggerLevel.LOG_INFO.getLoggerLevel(), "信息");
        logger.log(LoggerLevel.LOG_ERROR.getLoggerLevel(), "异常");
        logger.log(LoggerLevel.LOG_DEBUG.getLoggerLevel(), "调试");
    }
    
    public static AbstractLogger getLogger() {
        /**
         * 组成责任链并返回
         */
        AbstractLogger errorLogger = new ErrorLogger();
        AbstractLogger debugLogger = new DebugLogger();
        AbstractLogger infoLogger = new InfoLogger();
        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);
        return infoLogger;
    }
}
