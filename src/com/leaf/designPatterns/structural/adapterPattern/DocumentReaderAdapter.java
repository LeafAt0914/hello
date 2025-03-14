package com.leaf.designPatterns.structural.adapterPattern;

/**
 * @author leshu
 * @since 2025/3/11 16:20
 **/
public class DocumentReaderAdapter implements DocumentReader {

    AdvancedDocumentReader advancedDocumentReader;

    public DocumentReaderAdapter(String docType) {
        if (".doc".equals(docType)) {
            advancedDocumentReader = new DocReader();
        } else if (".xls".equals(docType)) {
            advancedDocumentReader = new XlsReader();
        }
    }

    @Override
    public void read(String docType, String fileName) {
        if (".doc".equals(docType)) {
            advancedDocumentReader.readDoc(fileName);
        } else if (".xls".equals(docType)) {
            advancedDocumentReader.readXls(fileName);
        }
    }
}
