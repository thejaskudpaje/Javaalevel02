package CollectionFramework;
import java.util.*;
import java.util.Collections;

public class FloatArray {
public static void main(String[] args) {
ArrayList<Float> ob=new ArrayList<Float>();
ob.add(25.5f);
ob.add(45.3f);
ob.add(35.6f);
ob.add(18.5f);
System.out.println(ob);
System.out.println("\nPrinting using for loop");
for(int i=0;i<ob.size();i++) {
	System.out.print(ob.get(i)+"  ");
}

HashSet<Integer> hs = new HashSet<Integer>();
hs.add(null);
hs.add(100);
System.out.println("HASHSET");
for(Integer i : hs)	{
	System.out.println(i);
}
System.out.println("\nPrinting before sorting");
for(Float i: ob) {
	System.out.print(i+"  ");
}

Collections.sort(ob);
System.out.println("\nPrinting After sorting incrementing");
for(Float i: ob) {
	System.out.print(i+"  ");
}

Collections.sort(ob,Collections.reverseOrder());
System.out.println("\nPrinting After sorting Decrement");
for(Float i: ob) {
	System.out.print(i+"  ");
}
}
}
