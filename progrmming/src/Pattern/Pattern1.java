package Pattern;
import java.util.Scanner;
public class Pattern1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter no of rows and columns of the matrix ");
	int row=s.nextInt();
	int col=s.nextInt();
	int a[][] = new int[row][col];
	int b[][] = new int[row][col];
	System.out.println("Enter elements into first matrix");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
		
			a[i][j]=s.nextInt();
		}
	}
	System.out.println("Enter elements into second matrix");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
		
			b[i][j]=s.nextInt();
		}
	}
	System.out.println("Result matrix");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
		
			System.out.print(a[i][j] + b[i][j] + "\t");
		}
		System.out.println();
	}
}
}
