package com.leaf.designPatterns.behavioral.chainOfResponsibilityPattern;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InfoLogger extends AbstractLogger{

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void doLog(String message) {
        String d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println(d + " INFO : " + message);
    }
}
