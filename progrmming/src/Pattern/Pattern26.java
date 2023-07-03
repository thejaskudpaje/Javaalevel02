package Pattern;
import java.util.Scanner;
public class Pattern26 {
public static void main(String[] args) {
	System.out.println("Enter the pattern size: ");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print("  ");
		}
		int x=i;
		for(int j=1;j<=i*2-1;j++) {
			System.out.print(x+" ");
			if(j<i)
				x--;
			else
				x++;
		}
		System.out.println();
	}
}
}
