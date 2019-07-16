package structural.flyweight;

import structural.flyweight.beans.InventorySystem;

public class TestFlyweight {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.takeOrder("Romba", 211);
        inventorySystem.takeOrder("Bose Headphone", 213);
        inventorySystem.takeOrder("Romba", 3);
        inventorySystem.takeOrder("Avocado", 12);
        inventorySystem.takeOrder("Romba", 235);
        inventorySystem.takeOrder("Romba", 246);
        inventorySystem.takeOrder("Romba", 257);

        inventorySystem.process();

        System.out.println(inventorySystem.report());
    }
}
