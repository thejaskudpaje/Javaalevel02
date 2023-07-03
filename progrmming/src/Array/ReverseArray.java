package Array;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		System.out.print("Enter the sie of the array: ");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();	
		} 
			reverse(a);
			System.out.println("After reversing");
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
		
	}
	public static void reverse(int a[]) {
int i=0,j=a.length-1;


do{
	int temp=a[i];
a[i]=a[j];
a[j]=temp;
i++;
j--;
}while(i<j);

	}
}
