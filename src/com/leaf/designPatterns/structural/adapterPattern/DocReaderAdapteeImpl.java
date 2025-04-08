package com.leaf.designPatterns.structural.adapterPattern;


public class DocReaderAdapteeImpl implements DocumentReaderAdaptee {
    @Override
    public void readDoc(String fileName) {
        System.out.println("reading doc file: " + fileName);
    }

    @Override
    public void readXls(String fileName) {

    }
}
