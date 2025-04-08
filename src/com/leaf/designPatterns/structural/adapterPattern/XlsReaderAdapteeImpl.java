package com.leaf.designPatterns.structural.adapterPattern;


public class XlsReaderAdapteeImpl implements DocumentReaderAdaptee {
    @Override
    public void readDoc(String fileName) {

    }

    @Override
    public void readXls(String fileName) {
        System.out.println("reading xls file: " + fileName);
    }
}
