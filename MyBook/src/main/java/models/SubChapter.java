package models;

import models.Element;

import java.util.ArrayList;

public class SubChapter{
    private String name;
    private ArrayList<Element> elements = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Subchapter: " + name);
        for(Element el : elements) {
            el.print();
        }
    }

    public void addElement(Element el) {
        elements.add(el);
    }
}
