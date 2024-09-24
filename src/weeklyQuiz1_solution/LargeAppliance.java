package chap08.src.weeklyQuiz1_solution;

import java.math.BigDecimal;

public class LargeAppliance extends Product{
    public LargeAppliance(String name, BigDecimal price, int weight) {
        super(name, price, weight);
    }

    @Override
    public BigDecimal getDiscountAmount() {
        return BigDecimal.ZERO;
    }
}
