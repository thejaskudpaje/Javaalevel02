package CollectionFramework;
import java.util.ArrayList;
import java.util.Collections;

public class BusObject implements Comparable<BusObject> {
	int num;
	String route;
	
	public BusObject(int num,String route) {
		this.num=num;
		this.route=route;
	}
	
public static void main(String[] args) {
ArrayList<BusObject> ar=new ArrayList<BusObject>();
ar.add(new BusObject(129,"Yelahanka"));
ar.add(new BusObject(125,"Hebbal") );
ar.add(new BusObject(138,"Silk board"));

System.out.println("Before compairing");
for(BusObject i :ar) {
	System.out.println(i);
}


Collections.sort(ar);
System.out.println("\nAfter sorting by name");
for(BusObject i :ar) {
	System.out.println(i);
}
}

public int compareTo(BusObject ob) {
	if(this.route.compareTo(ob.route)==0)
		return 0;
	else if(this.route.compareTo(ob.route)>=0)
		return 1;
	else if(this.route.compareTo(ob.route)<0)
		return -1;
	//return 0;

}



@Override
public String toString() {
	return "BusObject [num=" + num + ", route=" + route + "]";
}


}
