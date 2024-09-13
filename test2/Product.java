package chap08.test2;

public class Product{
    String name;
    double price;
    double weight;

    Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return this.price;
    }

    public double getWeight() {
        return this.price;
    }
}
