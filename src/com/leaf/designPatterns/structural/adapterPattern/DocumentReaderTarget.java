package com.leaf.designPatterns.structural.adapterPattern;


public interface DocumentReaderTarget {

    void read(String docType, String fileName);
}
