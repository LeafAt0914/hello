package com.leaf.designPatterns.behavioral.chainOfResponsibilityPattern;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author leshu
 * @since 2025/3/14 10:59
 **/
public class WarnLogger extends AbstractLogger {

    public WarnLogger(int level) {
        this.level = level;
    }

    @Override
    protected void doLog(String message) {
        String d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println(d + " WARN : " + message);
    }
}
