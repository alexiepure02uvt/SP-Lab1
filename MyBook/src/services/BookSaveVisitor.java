package services;

import models.*;

public class BookSaveVisitor implements Visitor {

    private String path;

    BookSaveVisitor(String path) {
        this.path = path;
    }

    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {

    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {

    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {

    }

    @Override
    public void visitImage(Image image) {

    }

    @Override
    public void visitTable(Table table) {

    }
}
