package CollectionFramework;
/*create a floating point array list add 5 elements print using for loop and foreach loop 
 create another array list of object type,add first list to second list
 */
import java.util.ArrayList;
public class ArrayListFloat {
public static void main(String[] args) {
	ArrayList<Float> a1=new ArrayList<Float>();
	a1.add(2.5f);
	a1.add(null);
	a1.add(4.5f);
	a1.add(5.5f);
	a1.add(6.5f);
	
	for(int i=0;i<a1.size();i++) {
		System.out.println(a1.get(i));
		
	}
	System.out.println();
	for(Float i: a1) {
	
		System.out.println(i);
	}
	
	ArrayList<Object> a2=new ArrayList<Object>();
	a2.add(2);
	a2.add(null);
	a2.add(4);
	a2.add(5);
	a2.add(6);
	
	a2.addAll(a1);
	
	System.out.println();
	for(Object j: a2) {
	
		System.out.println(j);
	}
	
}
}
