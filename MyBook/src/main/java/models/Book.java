package models;

import java.util.ArrayList;

public class Book extends Section{
    private String title;
    private ArrayList<Author> authors;

    public Book(String name) {
        super();
        this.title = name;
    }
    public void print() {
        System.out.println("models.Book: " + this.title + "\n");
        System.out.println("Authors:");
        for(Author a : authors) {
            System.out.print("models.Author: ");
            a.print();
        }
        System.out.println();
        super.print();
    }
    public void addAuthor(Author a) {
        if(authors == null) {
            authors = new ArrayList<>();
        }
        authors.add(a);
    }
    public void addContent(Element e) throws Exception {
        super.add(e);
    }

    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }
}