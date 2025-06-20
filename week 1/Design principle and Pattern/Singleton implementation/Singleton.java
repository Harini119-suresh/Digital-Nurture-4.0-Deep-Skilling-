
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        } else {
            System.out.println("Returning existing Singleton instance");
        }
        return instance;
    }
}
