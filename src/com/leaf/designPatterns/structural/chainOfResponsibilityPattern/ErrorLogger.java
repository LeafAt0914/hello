package com.leaf.designPatterns.structural.chainOfResponsibilityPattern;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author leshu
 * @since 2025/3/14 10:58
 **/
public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void doLog(String message) {
        String d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println(d + " ERROR : " + message);
    }
}
