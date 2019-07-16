package structural.facade;

import structural.facade.beans.JdbcFacade;

public class TestFacade {
    public static void main(String[] args) {
        JdbcFacade facade = new JdbcFacade();

        //facade.insertIntoTable(2, "Soveja", "Constanta");
        //facade.insertIntoTable(3, "Maramures", "Constanta");
        facade.getAddresses().forEach(System.out::println);

    }
}
