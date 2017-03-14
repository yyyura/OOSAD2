public class Singleton {

	//static member
	private static Singleton singleton;

	//private constructor	
	private Singleton() {}

	//staic method
	public static Singleton getInstance() {
		if (singleton == null){
		singleton = new Singleton();
		}
		return singleton; 		
	}

}
