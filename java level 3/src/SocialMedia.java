
public class SocialMedia {
String username;
long contact;
int password;

public SocialMedia(String username,long contact,int password) {
	this.username=username;
	this.contact=contact;
	this.password=password;
}
public static void main(String[] args) {
	SocialMedia a=new SocialMedia("thejas",8748869540l,4433);
	SocialMedia b=new SocialMedia("srujan",8758545253l,1234);
	SocialMedia c=new SocialMedia("shravan",65845254555l,9988);
	System.out.println(a);
	System.out.println(a.equals(b));
}
public String toString() {
	return username+"\t"+contact+"\t"+password;
}

public boolean equals(SocialMedia ob) {
	if((this.username.equals(ob.username))&&(this.contact==ob.contact)&&(this.password==ob.password))
		return true;
	else
		return false;

}
}
