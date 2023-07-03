package CollectionFramework;

public class Singleton{
	private static Singleton st=new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getSingleton() {
		return st;
	}
}

