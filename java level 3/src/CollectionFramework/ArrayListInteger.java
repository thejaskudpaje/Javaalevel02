package CollectionFramework;
/*WJP to create an integer arraylist,read elements from user and add to array list, print using for 
each loop
 */
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListInteger {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	
		System.out.println("Enter the size of the array :");
		int size=s.nextInt();
		
		ArrayList<Object> a=new ArrayList<Object>();
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++) {
			a.add(s.next());
			
		}
		System.out.println();
		for(Object i: a) {
		
			System.out.println(i);
		}
		System.out.println();
		System.out.println(a);
	}

}
