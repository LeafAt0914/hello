package com.leaf.designPatterns.structural.adapterPattern;

/**
 * @author leshu
 * @since 2025/3/11 16:19
 **/
public class XlsReader implements AdvancedDocumentReader {
    @Override
    public void readDoc(String fileName) {

    }

    @Override
    public void readXls(String fileName) {
        System.out.println("reading xls file: " + fileName);
    }
}
