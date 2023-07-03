package CollectionFramework;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
public class HetList {
public static void main(String[] args) {
	ArrayList<Object> ob=new ArrayList<Object>();
	ob.add("BTM");
	ob.add("Qsp");
	ob.add(101);
	ob.add(25.5f);
	ob.add("BTM");
	ob.add(101);
	ob.add(101);
	
	System.out.println("Printing using for each loop");
	for(Object i:ob) {
		System.out.println(i);
	}
	System.out.println("\nPrinting using ListIterator forward");
	ListIterator<Object> it=ob.listIterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("\nprinting backward");
	while(it.hasPrevious()) {
		System.out.println(it.previous());
	}
	
	System.out.println("\nchecking the element");
	boolean b=ob.contains("BTM");
	System.out.println(b);
	
	System.out.println("\nConverting from list to set");
	HashSet<Object> hs= new HashSet<Object>(ob);
	System.out.println(hs);
	
}
}

