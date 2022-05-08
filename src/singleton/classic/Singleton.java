package singleton.classic;

import java.util.Objects;

public class Singleton {
    private static Singleton singleton;

    // important concept constructor must be private at any cost -----> needed to be taken care of
    private Singleton() {
    }

    ;

    public static Singleton getSingleton() {
        if (Objects.isNull(singleton)) {
            singleton = new Singleton();
            return singleton;
        }
        return singleton;
    }

    public String getDescription() {
        return "I am a classic singleton class";
    }
}
