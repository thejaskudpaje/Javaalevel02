package Array;
/*wjp to define a method to return average of integer array elements*/
import java.util.Scanner;

public class AvgOfArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n=s.nextInt();
		
	System.out.println("Enter the array elements :");
	int a[]=new int[n];
	for(int i=0;i<a.length;i++) {
		a[i]=s.nextInt();
	}
	
	double avg=calAvg(a);
	System.out.print("Average value :"+avg);
}
	public static double calAvg(int a[]) {
		double sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		double avg=sum/a.length;
	
		return avg;
	}
}