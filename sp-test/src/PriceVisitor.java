public class PriceVisitor implements Visitor {

    private double pizzaPrice;
    private double pastaPrice;
    private double saladPrice;

    public PriceVisitor() {
        this.pizzaPrice = 0;
        this.pastaPrice = 0;
        this.saladPrice = 0;
    }

    @Override
    public void visitPizza(Pizza pizza) {
        this.pizzaPrice += pizza.getPrice();
    }

    @Override
    public void visitPasta(Pasta pasta) {
        this.pastaPrice += pasta.getPrice();
    }

    @Override
    public void visitSalad(Salad salad) {
        this.saladPrice += salad.getPrice();
    }

    public void FoodPrices() {
        System.out.println("Price of all pizzas: " + this.pizzaPrice + "$");
        System.out.println("Price of all pastas: " + this.pastaPrice + "$");
        System.out.println("Price of all salads: " + this.saladPrice + "$");
    }

    public void TotalPrice() {
        System.out.println("Total price: " + (this.pizzaPrice + this.pastaPrice + this.saladPrice) + "$");
    }
}
