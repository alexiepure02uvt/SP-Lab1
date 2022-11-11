package models;

import java.util.ArrayList;

public class Section implements Element {
    private String name;
    private ArrayList<Element> subElements = new ArrayList<>();

    public Section(){}
    public Section(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println(name);
        for (Element el : subElements) {
            el.print();
        }
    }
    @Override
    public void add(Element e) throws Exception {
        // TODO Auto-generated method stub
        try {
            for (Element elem : subElements) {
                if (elem.find(e)) {
                    throw new Exception("Duplicate element found!");
                }
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        this.subElements.add(e);
    }
    @Override
    public Element get(int poz) {
        if (poz < 0 || poz >= this.subElements.size()) {
            return null;
        }
        return this.subElements.get(poz);
    }
    @Override
    public void remove(Element e) {
        this.subElements.remove(e);
    }
    @Override
    public boolean find(Element e) {
        for (Element elem : subElements) {
            if (elem.find(e)) {
                return true;
            }
        }
        return false;
    }

    public void accept(Visitor visitor) {
        visitor.visitSection(this);

        for (Element elem : subElements) {
            elem.accept(visitor);
        }
    }
}