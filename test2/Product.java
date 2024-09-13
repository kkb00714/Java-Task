package chap08.test2;

public class Product implements Promotion {
    String name;
    double price;
    double weight;

    Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public void getDiscountAmount() {

    }
}
