package Pattern;

import java.util.Scanner;

public class Pattern27 {
	public static void main(String[] args) {
		System.out.println("Enter the pattern size: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int t=n;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			int x=i;
			for(int j=1;j<=t*2-1;j++) {
				if(j<t) {
					System.out.print(x+" ");
					x++;
				}
				else {
					System.out.print(x+" ");
					x--;
				}
			}
			System.out.println();
			t--;
		}
		
	}	
}
