package singleton.stat;

public class Singleton {
    private static Singleton singleton = new Singleton();

    // needed to be private very important
    private Singleton() {
    }

    ;

    public static Singleton getInstance() {
        return singleton;
    }

    public String getDescription() {
        return "This is stat Singleton where we do eager initialization ";
    }
}
