package billpughsingleton;

public class BillPughSingleton {

    private BillPughSingleton() {
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public void singletonTest() {
        System.out.println("Bill Pugh Singleton Method Active.");
    }
}
