package com.leaf.designPatterns.structural.adapterPattern;

import com.leaf.designPatterns.structural.adapterPattern.impl.DocumentReaderImpl;
import com.leaf.designPatterns.structural.adapterPattern.impl.TxtReaderImpl;

/**
 * @author leshu
 * @since 2025/3/11 16:32
 **/
public class Main {
    public static void main(String[] args) {

        //适配前调用
        TxtReaderImpl txtReader = new TxtReaderImpl();
        txtReader.read("abandon.txt");

        //适配后调用
        DocumentReaderImpl documentReader = new DocumentReaderImpl();
        documentReader.read(".txt", "abandon.txt");
        documentReader.read(".doc", "abandon.doc");
        documentReader.read(".xls", "abandon.xls");
        documentReader.read(".pdf", "abandon.pdf");
    }
}
