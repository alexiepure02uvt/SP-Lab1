package services;

import com.google.gson.Gson;
import models.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookSaveVisitor implements Visitor {

    private String path;
    private Gson gson;

    private List<Image> images;
    private List<Paragraph> paragraphs;
    private List<Table> tables;

    public BookSaveVisitor(String path) {
        System.out.println(path);
        this.path = path;
        this.gson = new Gson();
        images = new ArrayList<Image>();
        paragraphs = new ArrayList<Paragraph>();
        tables = new ArrayList<Table>();
    }

    @Override
    public void visitBook(Book book) {

//        try {
//            gson.toJson(book, new FileWriter(this.path));
//        } catch (IOException e) {
//            System.out.println("unrecognised file path.");
//            e.printStackTrace();
//        }
    }

    @Override
    public void visitSection(Section section) {
//        try {
//            gson.toJson(section, new FileWriter(this.path));
//        } catch (IOException e) {
//            System.out.println("unrecognised file path.");
//            e.printStackTrace();
//        }
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
//        try {
//            gson.toJson(tableOfContents, new FileWriter(this.path));
//        } catch (IOException e) {
//            System.out.println("unrecognised file path.");
//            e.printStackTrace();
//        }
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        paragraphs.add(paragraph);
//        System.out.println("save paragraph in json.");
//        try {
//            gson.toJson(paragraph, new FileWriter(this.path));
//        } catch (IOException e) {
//            System.out.println("unrecognised file path.");
//            e.printStackTrace();
//        }
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
//        try {
//            gson.toJson(imageProxy, new FileWriter(this.path));
//        } catch (IOException e) {
//            System.out.println("unrecognised file path.");
//            e.printStackTrace();
//        }
    }

    @Override
    public void visitImage(Image image) {
        images.add(image);
//        try {
//            gson.toJson(image, new FileWriter(this.path));
//        } catch (IOException e) {
//            System.out.println("unrecognised file path.");
//            e.printStackTrace();
//        }
    }

    @Override
    public void visitTable(Table table) {
        tables.add(table);
//        try {
//            gson.toJson(table, new FileWriter(this.path));
//        } catch (IOException e) {
//            System.out.println("unrecognised file path.");
//            e.printStackTrace();
//        }
    }

    public void writeToJson() {
        try {
            gson.toJson(images, new FileWriter(this.path));
            gson.toJson(paragraphs, new FileWriter(this.path));
            gson.toJson(tables, new FileWriter(this.path));
        } catch (IOException e) {
            System.out.println("unrecognised file path.");
            e.printStackTrace();
        }
    }
}
