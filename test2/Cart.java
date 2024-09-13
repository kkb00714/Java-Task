package chap08.test2;

public class Cart {
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public int calculateDeliveryCharge() {
        double cnt = 0;

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            cnt += product.weight;
        }

        if (cnt < 3) {
            return 1000;
        } else if (cnt <= 3 && cnt < 10) {
            return 5000;
        } else {
            return 10000;
        }
    }

}
