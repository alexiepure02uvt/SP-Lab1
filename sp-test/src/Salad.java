public class Salad implements Element {
    private String name;
    private double price;

    public Salad(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Salad: " + this.name + " ... " + this.price + "$");
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSalad(this);
    }
}
