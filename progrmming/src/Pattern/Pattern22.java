package Pattern;

import java.util.Scanner;

public class Pattern22 {
	public static void main(String[] args) {
		System.out.println("enter the matrix size");
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
	
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i;j++) {
				System.out.print(j+" ");
			
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
