package com.leaf.designPatterns.behavioral.visitorPattern;


public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Monitor monitor);

    void visit(Keyboard keyboard);
}
