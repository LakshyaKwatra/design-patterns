package patterns.creational.singleton;

public class DoubleCheckedLockingSynchronizedSingleton {
    private static DoubleCheckedLockingSynchronizedSingleton instance;

    private DoubleCheckedLockingSynchronizedSingleton() {}

    public static DoubleCheckedLockingSynchronizedSingleton getInstance() {
        if(instance == null) {
            synchronized (DoubleCheckedLockingSynchronizedSingleton.class) {
                if(instance == null) {
                    instance = new DoubleCheckedLockingSynchronizedSingleton();
                }
            }
        }
        return instance;
    }
}
