package chap08.test2;

public class DeliveryDiscountLogic implements Promotion{
    private Cart cart;
    private int deliveryCharge;
    private int discountCharge;
    
    // 생성자에서 Cart 객체를 전달받음
    public DeliveryDiscountLogic(Cart cart) {
        this.cart = cart;
    }

    // 배송비 책정
    public int getDeliveryCharge() {
        int totalWeight = cart.getTotalWeight();
        if (totalWeight < 3) {
            this.deliveryCharge = 1000;
        } else if (totalWeight >= 3 && totalWeight < 10) {
            this.deliveryCharge = 5000;
        } else {
            this.deliveryCharge = 10000;
        }
        return deliveryCharge;
    }

    // 배송비 할인률
    @Override
    public void getDiscountAmount() {
        int totalDiscountCharge = cart.getTotalDeliveryCharge();
        if (totalDiscountCharge >= 30000 && totalDiscountCharge <= 100000) {
            this.discountCharge = 1000;
        } else {
            this.discountCharge = 0;
        }
    }

    public int getCalculatedDiscount() {  // 새 메서드 추가
        return discountCharge;
    }

}
