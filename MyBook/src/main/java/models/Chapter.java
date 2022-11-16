package models;

import java.util.ArrayList;

public class Chapter {
    private String name;
    private ArrayList<SubChapter> subChapters=new ArrayList<>();
    public Chapter(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println(name);
        for(SubChapter el:subChapters)
            el.print();
    }
    public int createSubChapter(String s) {
        subChapters.add(new SubChapter(s));
        return subChapters.size()-1;
    }
    public SubChapter getSubChapter(int i) {
        return subChapters.get(i);
    }
}
