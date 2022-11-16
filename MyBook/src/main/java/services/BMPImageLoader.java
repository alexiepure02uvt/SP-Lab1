package services;

import models.ImageContent;
import services.ImageLoader;

public class BMPImageLoader implements ImageLoader {

        @Override
        public ImageContent load(String img) {
            System.out.println("Creating BMP image");
            return new ImageContent(img);
        }
}
