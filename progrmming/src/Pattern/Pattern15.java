package Pattern;

import java.util.Scanner;

public class Pattern15 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the Size");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
