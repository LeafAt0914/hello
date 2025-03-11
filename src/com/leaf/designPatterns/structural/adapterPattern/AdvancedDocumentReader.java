package com.leaf.designPatterns.structural.adapterPattern;

/**
 * @author leshu
 * @since 2025/3/11 16:16
 **/
public interface AdvancedDocumentReader {

    void readDoc(String fileName);

    void readXls(String fileName);
}
