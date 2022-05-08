package singleton.threadsafe;

import java.util.Objects;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    ;

    public static synchronized Singleton getInstance() {
        if (Objects.isNull(singleton)) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public String getDescription() {
        return "This is a thread safe implementation of Singleton Class";
    }
}
