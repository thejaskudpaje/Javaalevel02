
public class Method {
	String a;
	String b;
	public Method(String a,String b) {
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args) {
		Method s=new Method("thejas","kudpaje");
		System.out.println(s);
		
	}
public String toString() {
	return a +" "+b;
}
}
