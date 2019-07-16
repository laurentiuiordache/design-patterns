package behavioral.templateMethod.beans;

public class StoreOrder extends OrderTemplate {

    public StoreOrder(boolean isGift) {
        this.isGift = isGift;
    }

    @Override
    public void doCheckout() {
        System.out.println("Ring up items from cart.");
    }

    @Override
    public void doPayment() {
        System.out.println("Process payment with card present");
    }

    @Override
    public void doReceipt() {
        System.out.println("Print receipt");
    }

    @Override
    public void doDelivery() {
        System.out.println("Bag items at counter");
    }
}
