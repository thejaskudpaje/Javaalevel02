package Array;
/*adding one array into another array from the specified index*/
import java.util.Scanner;
public class AddArray05 {
	public static void main(String[] args){ 
		Scanner s=new Scanner(System.in);
		ArrayOperartion ob=new ArrayOperartion();
		System.out.println("Enter the first array");
		int []x=ob.importArray();
		
		System.out.println("Enter the Second array");
		int []y=ob.importArray();
		
		System.out.println("Enter the index number :");
		int in=s.nextInt();
		
		int []z=addArray(x,y,in);
		System.out.println("Printing after merging");
		ob.display(z);
}
	public static int[] addArray(int []a,int[]b,int in) {
		if(in<0||in>=a.length) {
			System.out.println("Index number out of range");
		}
		int c[]=new int [a.length+b.length];
		for(int i=0;i<b.length;i++) {
			c[i+in]=b[i];
		}
		for(int i=0;i<a.length;i++) {
			if(i<in) {
				c[i]=a[i];
			}
			else
				c[b.length+i]=a[i];
		}
		return c;
		
	}
}
