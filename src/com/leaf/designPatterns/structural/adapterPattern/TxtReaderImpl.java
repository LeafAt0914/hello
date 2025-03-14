package com.leaf.designPatterns.structural.adapterPattern;

/**
 * @author leshu
 * @since 2025/3/11 16:51
 **/
public class TxtReaderImpl implements TxtReader {
    @Override
    public void read(String fileName) {
        System.out.println("reading txt file: " + fileName);
    }
}
