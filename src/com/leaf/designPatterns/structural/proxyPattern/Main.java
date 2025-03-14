package com.leaf.designPatterns.structural.proxyPattern;

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
