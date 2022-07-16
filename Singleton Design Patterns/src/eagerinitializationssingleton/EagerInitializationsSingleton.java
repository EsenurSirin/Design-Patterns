package eagerinitializationssingleton;

public class EagerInitializationsSingleton {

    private static final EagerInitializationsSingleton INSTANCE = new EagerInitializationsSingleton();

    private EagerInitializationsSingleton() {

    }

    public static EagerInitializationsSingleton getInstance() {
        return INSTANCE;
    }

    public void singletonTest() {
        System.out.println("Singleton Method Active.");
    }
}
