package Exception;

public class ABC {
public static void main(String[] args) {
	String a=null;
	try {
		System.out.println(a.length());
	}
	catch(NullPointerException ob) {
		System.out.println(ob);
	}
	a="India";
	System.out.println(a+"Asia");
}
}
