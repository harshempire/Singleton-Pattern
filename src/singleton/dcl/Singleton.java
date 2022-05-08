package singleton.dcl;

import java.util.Objects;

// double check syncronized lock
public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {
    }

    ;

    // we are checking twice.
    public static Singleton getInstance() {
        if (Objects.isNull(singleton)) {
            synchronized (Singleton.class) {
                if (Objects.isNull(singleton)) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public String getDescription() {
        return "This is dcl impl of Singleton class";
    }
}
