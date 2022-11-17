package models;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents implements Element {
    private String name;
    private List<String> content;
    public TableOfContents(String name) {
        super();
        this.name = name;
        this.content = new ArrayList<String>();
    }
    @Override
    public void print() {
        System.out.println(name);
        for (String elem : content) {
            System.out.println(elem);
        }
    }

    @Override
    public void add(Element e) throws Exception {

    }

    public void add(String element, int page) {
        content.add(element + " pag." + Integer.toString(page));
    }

    @Override
    public Element get(int poz) {
        return null;
    }
    @Override
    public void remove(Element e) {

    }
    @Override
    public boolean find(Element e) {
        return false;
    }

    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }
}

