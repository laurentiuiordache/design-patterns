package behavioral.templateMethod.beans;

public class WebOrder extends OrderTemplate {

    public WebOrder(Boolean isGift) {
        this.isGift = isGift;
    }

    @Override
    public void doCheckout() {
        System.out.println("Get items from cart,");
        System.out.println("Set figt preferences,");
        System.out.println("Set delivery address");
        System.out.println("Set billing address");
    }

    @Override
    public void doPayment() {
        System.out.println("Process payment without Card present");
    }

    @Override
    public void doReceipt() {
        System.out.println("Email receipt");
    }

    @Override
    public void doDelivery() {
        System.out.println("Ship the item to address");
    }
}
