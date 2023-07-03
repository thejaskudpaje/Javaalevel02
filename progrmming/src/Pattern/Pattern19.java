package Pattern;

import java.util.Scanner;

public class Pattern19 {
	public static void main(String[] args) {
		System.out.println("enter the matrix size");
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int x=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i*2-1;j++) {
				System.out.print(x%2+" ");
				x++;
			}
			System.out.println();
		}
	}
}
