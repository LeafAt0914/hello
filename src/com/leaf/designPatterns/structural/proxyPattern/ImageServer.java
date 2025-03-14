package com.leaf.designPatterns.structural.proxyPattern;

/**
 * @author leshu
 * @since 2025/3/13 16:42
 **/
public class ImageServer implements Server {

    public ImageServer(String authToken) {
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
