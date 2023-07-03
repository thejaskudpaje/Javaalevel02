package Pattern;

import java.util.Scanner;

public class Pattern40 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int n=sc.nextInt();
		
		int f=n, s=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<n*2;j++) {
				if(j<=f) {
					System.out.print("*");

				}
				else if(j>=s) {
					System.out.print("*");
					
				}
				else
					System.out.print(" ");
			}
			f--;
			s++;
		
		System.out.println();
		}
	}
	
}
