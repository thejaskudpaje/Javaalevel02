package CollectionFramework;

class TestSingleton {
public static void main(String[] args) {
	Singleton ob1 = Singleton.getSingleton();
	Singleton ob2 = Singleton.getSingleton();
	
	if(ob1==ob2) {
		System.out.println("Singleton class created");
	}
	else {
		System.out.println("Coud not create singleton");
	}
}
}