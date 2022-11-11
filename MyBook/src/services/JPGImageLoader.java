package services;

import models.ImageContent;

public class JPGImageLoader implements ImageLoader {
    @Override
    public ImageContent load(String img) {
        System.out.println("Creating JPG image");
        return new ImageContent(img);
    }
}