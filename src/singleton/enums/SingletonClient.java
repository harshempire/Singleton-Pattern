package singleton.enums;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.UNIQUE_INSTACES;
        System.out.println(singleton.getDescription());
    }
}
