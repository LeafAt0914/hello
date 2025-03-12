package com.leaf.designPatterns.structural.bridgePattern.impl;

import com.leaf.designPatterns.structural.bridgePattern.Color;

/**
 * @author leshu
 * @since 2025/3/12 16:07
 **/
public class Red implements Color {
    @Override
    public void coloring(String shape) {
        System.out.println("红色的" + shape);
    }
}
