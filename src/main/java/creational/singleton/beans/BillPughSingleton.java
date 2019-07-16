package creational.singleton.beans;

public class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static class SinbletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SinbletonHelper.INSTANCE;
    }
}
