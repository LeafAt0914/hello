package com.leaf.designPatterns.structural.proxyPattern.impl;

import com.leaf.designPatterns.structural.proxyPattern.Server;

/**
 * @author leshu
 * @since 2025/3/13 16:42
 **/
public class ImageServer implements Server {

    private String authToken;

    public ImageServer(String authToken) {
        this.authToken = authToken;
        connectAuth(authToken);
    }

    @Override
    public void connect() {
        System.out.println("connected to imageServer");
    }

    private void connectAuth(String authToken) {
        System.out.println("check connect authToken: " + authToken);
    }
}
