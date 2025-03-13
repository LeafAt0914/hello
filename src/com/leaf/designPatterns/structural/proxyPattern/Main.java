package com.leaf.designPatterns.structural.proxyPattern;

import com.leaf.designPatterns.structural.proxyPattern.impl.ImageServerProxy;

/**
 * @author leshu
 * @since 2025/3/13 16:51
 **/
public class Main {

    public static void main(String[] args) {
        ImageServerProxy imageServerProxy = new ImageServerProxy();

        imageServerProxy.connect();
        System.out.println();
        imageServerProxy.connect();
    }
}
