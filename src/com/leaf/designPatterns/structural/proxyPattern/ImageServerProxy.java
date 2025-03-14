package com.leaf.designPatterns.structural.proxyPattern;

/**
 * @author leshu
 * @since 2025/3/13 16:46
 **/
public class ImageServerProxy implements Server {

    private ImageServer imageServer;

    private final String autoToken = "sdf1a5sf555je2a2w1o2133";

    @Override
    public void connect() {
        if (imageServer == null) {
            imageServer = new ImageServer(autoToken);
        }
        imageServer.connect();
    }
}
