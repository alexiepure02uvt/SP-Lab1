package models;

import services.ImageLoader;
import services.ImageLoaderFactory;

import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {
    private String imageName;
    private Dimension dim;
    private ImageLoaderFactory factory = new ImageLoaderFactory();
    private ImageContent content;

    public Image(String imageName) {
        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep( 5 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.dim = new Dimension(1, 2);
    }
    public void print(){
        if (content != null) {
            System.out.println("Image: " + imageName + "content: " + content);
        }
        else {
            System.out.println("Image: " + imageName);
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
        if (!(e instanceof Image)) {
            return false;
        }
        else {
            return ((Image) e).imageName.equals(this.imageName);
        }
    }
    @Override
    public String url() {
        return imageName;
    }
    @Override
    public Dimension dim() {
        return this.dim;
    }

    public ImageContent getContent() {
        return content;
    }
    public void setContent(String type) {
        ImageLoader loader = factory.create(type);
        content = loader.load("dummy content");
    }

    public void accept(Visitor visitor) {
        visitor.visitImage(this);
    }
}