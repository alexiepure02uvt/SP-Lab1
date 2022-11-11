package models;

public class Author {
    private String name;

    public Author(String name) {
        super();
        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }
}