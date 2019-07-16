package behavioral.templateMethod;

import behavioral.templateMethod.beans.OrderTemplate;
import behavioral.templateMethod.beans.StoreOrder;
import behavioral.templateMethod.beans.WebOrder;

public class TestTemplateMethod {
    public static void main(String[] args) {
        System.out.println("Web order: ");

        OrderTemplate webOrder = new WebOrder(false);
        webOrder.processOrder();

        System.out.println("\nStore order: ");
        OrderTemplate storeOrder = new StoreOrder(true);
        storeOrder.processOrder();
    }
}
