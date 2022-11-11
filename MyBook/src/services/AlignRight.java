package services;

import models.Context;
import models.Paragraph;

public class AlignRight implements AlignStrategy {

    @Override
    public void render(Paragraph p, Context c) {
        System.out.println("Paragraph: " + p.getName() + " align right");
    }

}