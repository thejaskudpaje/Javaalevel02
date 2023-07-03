package Array;
/*merge two sorted array element into single array in sorted format*/
import java.util.Collections;
public class AddArray03 {
	public static void main(String[] args){ 
		ArrayOperartion ob=new ArrayOperartion();
		System.out.println("Enter the first array");
		int []x=ob.importArray();
		
		System.out.println("Enter the Second array");
		int []y=ob.importArray();
		
		
		
		int []q=sort(x,y);
		System.out.println("\nPrinting after sorting");
		ob.display(q);
	}

	public static int[] sort(int []a,int[]b) {
		int c[]=new int[a.length+b.length];
		int i=0,j=0;
		while(i<a.length&&i<b.length) {
			c[j]=a[i];
			j++;
			c[j]=b[i];
			j++;
			i++;
		}
		while(i<a.length) {
			c[j]=a[i];
			j++;
			i++;
		}
		while(i<b.length) {
			c[j]=a[i];
			j++;
			i++;
		}
		return c;
	}
}
