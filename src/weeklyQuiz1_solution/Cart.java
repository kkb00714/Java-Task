package chap08.src.weeklyQuiz1_solution;

import static chap08.src.weeklyQuiz1_solution.Policy.*;

import java.math.BigDecimal;

public class Cart {
    private Product[] products;
    // 상품의 총 가격
    private BigDecimal totalPrice;

    // 상품의 총 무게
    private double totalWeight;

    public Cart(Product[] products) {
        this.products = products;
        this.totalPrice = BigDecimal.ZERO;
        for (Product product: products) {
            this.totalPrice = totalPrice.add(product.getPrice());
            this.totalWeight += product.getWeight();
        }
    }

    public int calculateDeliveryCharge() {
        int deliveryCharge = getDeliveryChargePolicy(totalWeight);

        // 상품 총 가격에 따라 추가 계산
        if (totalPrice.compareTo(PRICE_POLICY_LEVEL_1) < 0) {
            return deliveryCharge;
        } else if (totalPrice.compareTo(PRICE_POLICY_LEVEL_2) < 0) {
            return deliveryCharge - DELIVERY_DISCOUNT_AMOUNT;
        }
        return Policy.DELIVERY_CHARGE_FREE;
    }
}
