package singleton.classic;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton.getDescription());
    }
}
