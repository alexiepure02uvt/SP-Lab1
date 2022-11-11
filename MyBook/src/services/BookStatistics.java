package services;

import jdk.swing.interop.SwingInterOpUtils;
import models.*;

public class BookStatistics implements Visitor {

    private int paragraphs = 0;
    private int images = 0;
    private int tables = 0;


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
        paragraphs++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        images++;
    }

    @Override
    public void visitImage(Image image) {
        images++;
    }

    @Override
    public void visitTable(Table table) {
        tables++;
    }

    public void printStatistics() {
        System.out.println("Number of images: " + images);
        System.out.println("Number of paragraphs: " + paragraphs);
        System.out.println("Number of tables: " + tables);
    }
}
