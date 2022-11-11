package models;

import services.AlignStrategy;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }
    public void print(){
        if (alignStrategy != null) {
            alignStrategy.render(this, new Context());
        }
        else {
            System.out.println("Paragraph: " + text);
        }
    }
    @Override
    public void add(Element e) {
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
        if (!(e instanceof Paragraph)) {
            return false;
        }
        else {
            return ((Paragraph) e).text.equals(this.text);
        }
    }

    public String getName() {
        return this.text;
    }
    public void setAlignStrategy(AlignStrategy align) {
        this.alignStrategy = align;
    }

    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}
