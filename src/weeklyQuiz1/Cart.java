package chap08.src.weeklyQuiz1;

public class Cart {
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    // 총 무게 메서드
    public int getTotalWeight() {
        int totalWeight = 0;
        for (Product product: products) {
            totalWeight += (int) product.getWeight();
        }
        return totalWeight;
    }

    // 총 가격 메서드
    public int getTotalDeliveryCharge() {
        int totalDeliveryCharge = 0;
        for (Product product: products) {
            totalDeliveryCharge += (int) product.getPrice();
        }
        return totalDeliveryCharge;
    }


    // 배송비를 계산해주는 메서드
    public int calculateDeliveryCharge() {
        DeliveryDiscountLogic discountLogic = new DeliveryDiscountLogic(this);
        int deliveryCharge = discountLogic.getDeliveryCharge();
        discountLogic.getDiscountAmount();
        int discount = discountLogic.getCalculatedDiscount();

        return deliveryCharge - discount;
    }

}
