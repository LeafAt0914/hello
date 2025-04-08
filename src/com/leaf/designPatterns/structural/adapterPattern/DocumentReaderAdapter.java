package com.leaf.designPatterns.structural.adapterPattern;


public class DocumentReaderAdapter implements DocumentReaderTarget {

    TxtReaderImpl txtReader;

    DocumentReaderAdaptee documentReaderAdaptee;

    @Override
    public void read(String docType, String fileName) {
        if (".txt".equals(docType)) {
            txtReader = new TxtReaderImpl();
            txtReader.read(fileName);
        } else if (".doc".equals(docType)) {
            documentReaderAdaptee = new DocReaderAdapteeImpl();
            documentReaderAdaptee.readDoc(fileName);
        } else if (".xls".equals(docType)) {
            documentReaderAdaptee = new XlsReaderAdapteeImpl();
            documentReaderAdaptee.readXls(fileName);
        } else {
            System.out.println(docType + " is not supported");
        }
    }
}
