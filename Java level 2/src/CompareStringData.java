
public class CompareStringData {
String name;
int id;

public CompareStringData(String name, int id) {
	this.name=name;
	this.id=id;
}
public static void main(String []arg) {
	String s1="thejas";
	String s2="thejas";
	System.out.println(s1==s2);
	CompareStringData a1=new CompareStringData("thejas",101);
	CompareStringData a2=new CompareStringData("thejas",101);
	
	System.out.println(a1.equals(a2));
}

public boolean equals(CompareStringData a2) {
	if(this.name==a2.name && this.id==id) {
		return true;
	}
	
	else 
		return false;
}
}
