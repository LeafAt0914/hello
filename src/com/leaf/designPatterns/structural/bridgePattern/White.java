package com.leaf.designPatterns.structural.bridgePattern;

/**
 * @author leshu
 * @since 2025/3/12 16:09
 **/
public class White implements Color {
    @Override
    public void coloring(String shape) {
        System.out.println("白色的" + shape);
    }
}
