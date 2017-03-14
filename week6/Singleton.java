public class Singleton {

    //static member
    private static Singleton instance;

    //private constructor	
    private Singleton() {
    }

    //staic method
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /* Other methods protected by singleton-ness */
    protected static void demoMethod() {
        System.out.println("demoMethod for singleton");

    }
}
