package Array;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		System.out.print("Enter the sie of the array: ");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		int sum=getSum(a);
		System.out.println("Sum of the Array elements : "+sum);
	}
	public static int getSum(int ar[]) {
		int s=0;
		for(int i=0;i<ar.length;i++) {
			s=s+ar[i];
		}
		return s;
	}
}
