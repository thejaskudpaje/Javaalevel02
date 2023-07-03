package Array;
/*define a method to return the diffrence of biggest and smallest element of integer array*/
import java.util.Scanner;

public class DifOfBigAndSmall {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n=s.nextInt();
		
	System.out.println("Enter the array elements :");
	int a[]=new int[n];
	for(int i=0;i<a.length;i++) {
		a[i]=s.nextInt();
	}
	
	int diff=findDiffrence(a);
	System.out.print("Diffrence :"+diff);
}
	public static int findDiffrence(int ar[]) {
		int big=ar[0],small=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>big)
				big=ar[i];
			if(ar[i]<small)
				small=ar[i];
		}
	return big-small;
	}
}