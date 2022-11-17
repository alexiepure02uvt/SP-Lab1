import models.*;
import services.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Book book = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel Gheo");
        book.addAuthor(rpGheo);

        Section cap1 = new Section("Cap1");
        cap1.add(new Paragraph("para2"));
        cap1.add(new Paragraph("para3"));
        cap1.add(new Section("Cap2"));
        cap1.add(new Paragraph("para4"));
        cap1.add(new ImageProxy("img1"));
        cap1.add(new Image("img2"));
        cap1.add(new Paragraph("para5"));
        cap1.add(new Section("subCap1"));
        cap1.add(new Table("table1"));

        BookContentVisitor visitor = new BookContentVisitor();
        cap1.accept(visitor);
        book.addContent(visitor.getTableOfContents());
        book.print();
    }
}
