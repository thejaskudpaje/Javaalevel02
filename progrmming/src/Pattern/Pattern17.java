package Pattern;

import java.util.Scanner;

public class Pattern17 {
	public static void main(String[] args) {
		System.out.println("enter the matrix size");
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("  ");
			}
			for(int j=i; j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
