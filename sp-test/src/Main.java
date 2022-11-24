public class Main {

    public static void main(String[] args) {
        Order cart = new Order("Cart");

        Order mcDonalds = new Order("McDonalds");
        Order menuMcDonalds = new Order("Big Mac Menu");    // sub-comanda in in comanda McDonalds
        Order littleHanoi = new Order("Little Hanoi");
        Order mesopotamia = new Order("Mesopotamia");

        Pizza salami = new Pizza("Salami", 4.5);
        Pizza diavola = new Pizza("Diavola", 13.5);
        Pizza napoli = new Pizza("Napoli", 11.4);
        Pasta carbonara = new Pasta("Carbonara", 21.2);
        Salad colesaw = new Salad("Colesaw", 3.7);
        Pizza bigMac = new Pizza("Big Mac", 12.1);

        mcDonalds.add(salami);
        mcDonalds.add(salami);
        mcDonalds.add(diavola);

        menuMcDonalds.add(bigMac);
        mcDonalds.add(menuMcDonalds);

        littleHanoi.add(diavola);
        littleHanoi.add(carbonara);
        littleHanoi.add(napoli);

        mesopotamia.add(salami);
        mesopotamia.add(colesaw);

        cart.add(mcDonalds);
        cart.add(littleHanoi);
        cart.add(mesopotamia);

        cart.print();

        System.out.println();

        PriceVisitor visitor = new PriceVisitor();
        cart.accept(visitor);
        visitor.FoodPrices();

        System.out.println();

        visitor.TotalPrice();
    }
}
