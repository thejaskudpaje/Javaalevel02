package CollectionFramework;
/*create a hashlist of float eleents 
 * print it by iterator
 * convert it into tree set*/
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
public class HashSetToTreeSet {
public static void main(String[] args) {
	HashSet<Float> hs=new HashSet<Float>();
	hs.add(10.5f);
	hs.add(18.5f);
	hs.add(15.35f);
	hs.add(null);
	System.out.println("Printing from HashSet");
	Iterator<Float> it=hs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("\nPrinting from TreeSet");
	TreeSet<Float> ts=new TreeSet<Float>(hs);
	Iterator<Float> ob=ts.iterator();
	while(ob.hasNext()) {
		System.out.println(ob.next());
	}
	
}
}
