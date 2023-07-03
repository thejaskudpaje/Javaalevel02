package Pattern;

import java.util.Scanner;

public class Pattern30 {
	public static void main(String[] args) {
		System.out.println("Enter the pattern size: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=n/2+1;
		for(int i=1;i<=x;i++) {
			if(i==1||i==x) {
				System.out.print("*");
				//continue;
			}
			if(i==2||i==x-1) {
				System.out.print(" ");
				System.out.print("*");
				System.out.print(" ");
			}
			if(i>2&&i<x-1) {
				System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
				
		}
	}	
}




