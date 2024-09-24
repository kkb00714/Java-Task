package chap08.src.weeklyQuiz1_solution;

import java.math.BigDecimal;

public class Policy {
    static final BigDecimal PRICE_POLICY_LEVEL_1 = BigDecimal.valueOf(30_000);
    static final BigDecimal PRICE_POLICY_LEVEL_2 = BigDecimal.valueOf(100_000);
    static final int DELIVERY_DISCOUNT_AMOUNT = 1000;
    static final int DELIVERY_CHARGE_FREE = 0;

    public static int getDeliveryChargePolicy(double weight) {
        // 무게에 따른 배송비 책정
        if (weight < 3) {
            return 1000;
        } else if (weight < 10){ // 3
            return 5000;
        } else {
            return 10000;
        }
    }
}