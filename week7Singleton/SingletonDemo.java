public class SingletonDemo {
    public static void main(String[] args) {

        Singleton tmp1 = Singleton.getInstance();
	System.out.println(tmp1.demoMethod());

	Singleton tmp2 = Singleton.getInstance();        
	System.out.println(tmp2.demoMethod());
    }
}
