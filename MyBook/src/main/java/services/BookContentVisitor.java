package services;

import models.*;

import java.util.*;

public class BookContentVisitor implements Visitor {

    TableOfContents tableOfContents = new TableOfContents("content");
    int iterator = 1;
    @Override
    public void visitBook(Book book) {

    }

    public TableOfContents getTableOfContents() {
        return tableOfContents;
    }

    @Override
    public void visitSection(Section section) {
        tableOfContents.add(section.getName(), iterator);
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        iterator++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        iterator++;
    }

    @Override
    public void visitImage(Image image) {
        iterator++;
    }

    @Override
    public void visitTable(Table table) {

        iterator++;
    }
}