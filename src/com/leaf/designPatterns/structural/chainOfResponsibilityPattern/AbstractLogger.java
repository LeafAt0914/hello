package com.leaf.designPatterns.structural.chainOfResponsibilityPattern;

/**
 * @author leshu
 * @since 2025/3/14 10:43
 **/
public abstract class AbstractLogger {

    public static int INFO = 1;

    public static int WARN = 2;

    public static int ERROR = 3;

    protected int level;

    protected AbstractLogger next;

    public void setNext(AbstractLogger nextLogger) {
        this.next = nextLogger;
    }

    public void logMessage(int messageLevel, String message) {
        if (this.level <= messageLevel) {
            doLog(message);
        }
        if (next != null) {
            next.logMessage(messageLevel, message);
        }
    }

    abstract protected void doLog(String message);
}
