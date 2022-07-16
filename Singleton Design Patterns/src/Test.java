import billpughsingleton.BillPughSingleton;
import eagerinitializationssingleton.EagerInitializationsSingleton;
import lazysingleton.LazySingleton;
import staticblocksingleton.StaticBlockSingleton;
import threadsafesingelton.ThreadSafeSingleton;

public class Test {

    public static void main(String[] args) {
        EagerInitializationsSingleton.getInstance().singletonTest();
        StaticBlockSingleton.getStaticBlockSingleton().singletonTest();
        LazySingleton.getLazySingleton().singletonTest();
        ThreadSafeSingleton.getThreadSafeSingleton().singletonTest();
        BillPughSingleton.getInstance().singletonTest();
    }
}
