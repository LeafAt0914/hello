package com.leaf.designPatterns.structural.adapterPattern;


public class TxtReaderImpl implements TxtReader {
    @Override
    public void read(String fileName) {
        System.out.println("reading txt file: " + fileName);
    }
}
