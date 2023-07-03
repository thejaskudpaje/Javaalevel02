package Array;

import java.util.Scanner;

public class SumOfDegits {
	public static void main(String[] args) {
		System.out.print("Enter the sie of the array: ");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		sumDegits(a);
		System.out.println("Elements after Sum of the degits");
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
	}
	public static void sumDegits(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			int sum=0;
			do {
				int r=ar[i]%10;
				sum=sum+r;
				ar[i]/=10;
				
			}while(ar[i]!=0);
			ar[i]=sum;
		}
	
		

	}
	
	
}
