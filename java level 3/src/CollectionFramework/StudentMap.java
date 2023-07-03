package CollectionFramework;
/*Create a hashmap integer as key student object as value*/
import java.util.HashMap;
public class StudentMap {
int age;
String name;

public StudentMap(int age,String name) {
	this.age=age;
	this.name=name;
}


@Override
public String toString() {
	return age+" "+name;
}


public static void main(String[] args) {
	HashMap<Integer,StudentMap> ob=new HashMap<Integer,StudentMap>();
ob.put(101,new StudentMap(26,"Thejas"));
ob.put(103,new StudentMap(29,"Bharath"));
ob.put(102,new StudentMap(24,"Sunil"));
System.out.println(ob.entrySet());

for(Object i: ob.keySet()) {
	System.out.println(i+" "+ob.get(i));
	//System.out.println(ob.entrySet());
}
}
}
