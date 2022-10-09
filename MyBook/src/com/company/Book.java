package com.company;

import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<String> paragraphs;
    private ArrayList<String> images;
    private ArrayList<String> tables;

    public Book(String title) {
        this.title = title;
        this.paragraphs = new ArrayList<>();
        this.images = new ArrayList<>();
        this.tables = new ArrayList<>();
    }


    public void createNewParagraph(String paragraph) {
        this.paragraphs.add(paragraph);
    }

    public void createNewImage(String image) {
        this.images.add(image);
    }

    public void createNewTable(String table) {
        this.tables.add(table);
    }

    public void print() {
        System.out.println("Title: " + this.title);
        System.out.println("\nParagraphs:");
        for (String paragraph : this.paragraphs) {
            System.out.println("\t" + paragraph);
        }
        System.out.println("\nImages:");
        for (String image : this.images) {
            System.out.println("- " + image);
        }
        System.out.println("\nTables:");
        for (String table : this.tables) {
            System.out.println("- " + table);
        }
        System.out.println();
    }
}
