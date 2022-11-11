package models;

public class ImageProxy implements Element, Picture {
    private String url;
    private Dimension dim;
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
        this.dim = new Dimension(5, 10);
    }
    @Override
    public void print() {
        Image img = loadImage();
        img.print();
    }
    @Override
    public void add(Element e) throws Exception {

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
    @Override
    public String url() {
        return url;
    }
    @Override
    public Dimension dim() {
        return dim;
    }
    public Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }
}