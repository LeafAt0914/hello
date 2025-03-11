package com.leaf.designPatterns.structural.adapterPattern.impl;

import com.leaf.designPatterns.structural.adapterPattern.AdvancedDocumentReader;

/**
 * @author leshu
 * @since 2025/3/11 16:18
 **/
public class DocReader implements AdvancedDocumentReader {
    @Override
    public void readDoc(String fileName) {
        System.out.println("reading doc file: " + fileName);
    }

    @Override
    public void readXls(String fileName) {

    }
}
