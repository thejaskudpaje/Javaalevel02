package Pattern;

import java.util.Scanner;

public class Pattern23 {
	public static void main(String[] args) {
		System.out.println("enter the matrix size");
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
	
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
