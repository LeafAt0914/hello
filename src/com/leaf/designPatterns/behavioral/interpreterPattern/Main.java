package com.leaf.designPatterns.behavioral.interpreterPattern;

public class Main {

    public static void main(String[] args) {
        Expression expr1 = new SimpleExpression("male");
        Expression expr2 = new SimpleExpression("haha");

        System.out.println(expr1.interpret("John is male"));

        OrExpression orExpression = new OrExpression(expr1, expr2);
        System.out.println(orExpression.interpret("John is male"));

        AndExpression andExpression = new AndExpression(expr1, expr2);
        System.out.println(andExpression.interpret("John is male"));
        System.out.println(andExpression.interpret("John is male haha"));
    }
}
