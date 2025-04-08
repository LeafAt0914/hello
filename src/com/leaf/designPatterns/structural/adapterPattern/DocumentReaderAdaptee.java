package com.leaf.designPatterns.structural.adapterPattern;


public interface DocumentReaderAdaptee {

    void readDoc(String fileName);

    void readXls(String fileName);
}
