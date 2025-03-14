package com.leaf.designPatterns.behavioral.interpreterPattern;

public class SimpleExpression implements Expression {

    private String key;

    public SimpleExpression(String key) {
        this.key = key;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(key);
    }
}
