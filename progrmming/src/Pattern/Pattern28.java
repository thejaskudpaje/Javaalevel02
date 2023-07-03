package Pattern;

import java.util.Scanner;

public class Pattern28 {
	public static void main(String[] args) {
		System.out.println("Enter the pattern size: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int t=n;
		int x=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if(j<=x) 
					System.out.print("* ");
				else if(j>=t)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			x--;
			t++;
		}
	}
}
