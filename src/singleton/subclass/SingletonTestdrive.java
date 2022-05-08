package singleton.subclass;

public class SingletonTestdrive {
    public static void main(String[] args) {
        Singleton foo = CoolerSingleton.getIntances();
        Singleton bar = HotterSingleton.getIntances();
        System.out.println(foo.getDescription());
        System.out.println(bar.getDescription());
    }
}
