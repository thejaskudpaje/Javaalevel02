package CollectionFramework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;
public class ArrayString {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	ArrayList<String> a=new ArrayList<String>();
	/*System.out.print("Enter the Array length  :");
	int size=s.nextInt();
	System.out.println("\nEnter the Array elements: ");
	for(int i=0;i<size;i++) {
		a.add(s.next());
	}*/
	
	a.add("thejas");
	a.add("nishanth");
	a.add("hithesh");
	a.add(null);
	
	
	System.out.println("\nBefore sorting");
	System.out.println(a);
	
	Collections.sort(a);
	System.out.println("\nAfter sorting");
	System.out.println(a);
	
	Collections.sort(a,Collections.reverseOrder());
	System.out.println("\nAfter reversing :");
	System.out.println(a);
	
	System.out.println("\nPrinting using for loop");
	for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
	}
	
	System.out.println("\nPrinting using for-each loop");
	for(String i:a) {
		System.out.println(i);
	}
	System.out.println();
	System.out.println("Enter the Name to search in the list");
	
	if(a.contains(s.next()))
		System.out.println("Entered name is present ");
	else
		System.out.println("Entered name is not present");
	
	Iterator<String> b=a.iterator();
	while(b.hasNext()==true) {
		String c=b.next();
		if(c.equals("thejas")){
			b.remove();
		}
		else
			System.out.println(c);
	}
		
	
	
}
}
