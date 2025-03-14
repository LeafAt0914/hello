package com.leaf.designPatterns.structural.adapterPattern;

/**
 * @author leshu
 * @since 2025/3/11 16:29
 **/
public class DocumentReaderImpl implements DocumentReader {

    DocumentReaderAdapter documentReaderAdapter;

    TxtReaderImpl txtReader;

    @Override
    public void read(String docType, String fileName) {
        if (".txt".equals(docType)) {
            txtReader = new TxtReaderImpl();
            txtReader.read(fileName);
        } else if (".doc".equals(docType) || ".xls".equals(docType)) {
            documentReaderAdapter = new DocumentReaderAdapter(docType);
            documentReaderAdapter.read(docType, fileName);
        } else {
            System.out.println(docType + " is not supported");
        }
    }
}
