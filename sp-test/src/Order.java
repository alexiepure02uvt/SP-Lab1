import java.util.ArrayList;
import java.util.List;

public class Order implements Element {
    private String name;
    private List<Element> elements;

    public Order(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(Element element) {
        this.elements.add(element);
    }

    @Override
    public void print() {
        System.out.println();
        System.out.println("Order: " + this.name);
        for (Element element :
                this.elements) {
            element.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        for (Element element:
this.elements             ) {
            element.accept(visitor);
        }
    }
}
