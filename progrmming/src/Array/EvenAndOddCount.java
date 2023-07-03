package Array;

import java.util.Scanner;

public class EvenAndOddCount {
	public static void main(String[] args) {
		System.out.print("Enter the sie of the array: ");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();	
		} 
		int[] c=count(a);
		System.out.println("Even numbers :"+c[0]+"  Odd numbers :"+c[1]);
	}
	public static int[] count(int a[]) {
		int even=0,odd=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				even++;
			else
				odd++;
		}
		int[] count= {even,odd};
		return count;
	}
}
