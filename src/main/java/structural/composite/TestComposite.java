package structural.composite;

import structural.composite.beans.Menu;
import structural.composite.beans.MenuItem;

public class TestComposite {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "/main");
        Menu claimsSubMenu = new Menu("Claims", "/claims");
        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
        MenuItem personalClaimsMenu = new MenuItem("Personal claims", "/personalClaims");

        mainMenu.add(safetyMenuItem);
        mainMenu.add(claimsSubMenu);

        claimsSubMenu.add(personalClaimsMenu);

        System.out.println(mainMenu.toString());

    }
}
