package Array;

import java.util.Scanner;

public class PrimeNumbersCount {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n=s.nextInt();
		
	System.out.println("Enter the array elements :");
	int a[]=new int[n];
	for(int i=0;i<a.length;i++) {
		a[i]=s.nextInt();
	}
	System.out.println("******");
	int[] count=checkPrime(a);
	System.out.println(" Prime numbers count"+count[0]);
	}
	
	public static int[] checkPrime(int[] ar) {
		int count=0;
		for(int i=0;i<ar.length;i++) {
			int prime=0;
			for(int j=2;j<=ar[i]/2;j++) {
			
				if(ar[i]%j==0)
					prime++;
				
				
			}
			if(prime==0)
				count++;
		}
		System.out.println(count);
		int c[]= {count};
		return c;
	}
}
