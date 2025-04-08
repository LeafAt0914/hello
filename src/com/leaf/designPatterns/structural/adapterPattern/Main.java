package com.leaf.designPatterns.structural.adapterPattern;


public class Main {
    public static void main(String[] args) {

        //适配前调用
        TxtReaderImpl txtReader = new TxtReaderImpl();
        txtReader.read("abandon.txt");

        //适配后调用
        DocumentReaderAdapter documentReader = new DocumentReaderAdapter();
        documentReader.read(".txt", "abandon.txt");
        documentReader.read(".doc", "abandon.doc");
        documentReader.read(".xls", "abandon.xls");
        documentReader.read(".pdf", "abandon.pdf");
    }
}
