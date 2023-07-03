
public class Equals {
	String username;
	long contact;
	int password;

	public Equals(String username,long contact,int password) {
		this.username=username;
		this.contact=contact;
		this.password=password;
	}
	public static void main(String[] args) {
		Equals a=new Equals("thejas",8748869540l,4433);
		Equals b=new Equals("thejas k",8758545253l,1234);
		Equals c=new Equals("shravan",65845254555l,9988);
		String d=new String("kudpaje");
		
		System.out.println(d);
		System.out.println(a);
		System.out.println(a.equals(b));
		
		String s="Karnataka";
		System.out.println(s.substring(3,4));
	}
	public String toString() {
		return username+"\t"+contact+"\t"+password;
	}

	public boolean equals(Equals ob) {
		if(this.username.equals(ob.username))
			return true;
		else
			return false;

	}
}
