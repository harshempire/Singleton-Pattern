package singleton.subclass;

import java.util.Objects;

public class Singleton {
    private static Singleton singleton;

    protected Singleton() {
    }

    ;

    public static synchronized Singleton getIntances() {
        if (Objects.isNull(singleton)) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public String getDescription() {
        return "This is Subclass Singleton Class with protected Constructor";
    }
}
