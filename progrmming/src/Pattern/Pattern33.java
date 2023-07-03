package Pattern;

import java.util.Scanner;

public class Pattern33 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size :");
		int n=s.nextInt();
		
		int sp=n/2, st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++) {
				if(j==1||j==st) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			if(i<=n/2) {
				st=st+2;
				sp--;
			}
			else {
				st=st-2;
				sp++;
			}
			System.out.println();
		}
	}	
}
