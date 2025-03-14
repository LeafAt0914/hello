package com.leaf.designPatterns.structural.chainOfResponsibilityPattern;

/**
 * @author leshu
 * @since 2025/3/14 10:06
 **/
public class Main {

    private static AbstractLogger initLog() {
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        AbstractLogger warnLogger = new WarnLogger(AbstractLogger.WARN);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        errorLogger.setNext(warnLogger);
        warnLogger.setNext(infoLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = initLog();

        loggerChain.logMessage(AbstractLogger.INFO, "test start");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.WARN, "default convert may not safe");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.ERROR, "test failed");
    }
}
