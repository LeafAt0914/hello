package com.leaf.designPatterns.behavioral.visitorPattern;


public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
