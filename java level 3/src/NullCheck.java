class Parent{
	protected void check() {
		System.out.println("Parent");
	}
	
}
public class NullCheck extends Parent {
	static int b;
public static void main(String[] args) {
	NullCheck a=new NullCheck();
	Parent p=new NullCheck();
	p.check();
	a.display(null);
	b=10;
	System.out.println(b);
	
}
public void display(Object o) {
	System.out.println("Object");
	
}
public void display(String s) {
	System.out.println("String");
}
public final void check() {
	System.out.println("Child");
}
}
