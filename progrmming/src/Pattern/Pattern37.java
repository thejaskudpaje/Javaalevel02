package Pattern;

import java.util.Scanner;

public class Pattern37 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size :");
		int n=s.nextInt();
		
		int sp=0,st=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("   ");
			}
			for(int j=1;j<=st;j++) {
				System.out.print(" * ");
			}
			
			if(i<=n/2) {
				st=st-2;
				sp++;
			}
			else {
				st=st+2;
				sp--;
			}
			System.out.println();
		}
	}
}
