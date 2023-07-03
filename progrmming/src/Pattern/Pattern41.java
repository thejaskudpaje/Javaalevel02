package Pattern;

import java.util.Scanner;

public class Pattern41 {
	-
		
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			int x=1;
			for(int j=1;j<=i;j++) {
				System.out.print(x+"   ");
				x=x*(i-j)/j;
			}
			System.out.println();
		}
	}
	
}
