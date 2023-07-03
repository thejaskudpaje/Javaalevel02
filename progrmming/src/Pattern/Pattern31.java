package Pattern;
import java.util.Scanner;
public class Pattern31 {
public static void main(String[] args) {
	System.out.println("Enter the matrix size :");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	
	int sp=0,st=n;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=sp;j++) {
			System.out.print("   ");
		}
		int x=sp+1;
		for(int j=1;j<=st;j++) {
			System.out.print(" "+x+" ");
			if(j<=st/2)
				x++;
			else
				x--;
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
