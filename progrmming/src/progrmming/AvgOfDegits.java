package progrmming;
/*define a method to return avg of degits*/
import java.util.Scanner;
public class AvgOfDegits {
public static void main(String[] args) {
	java.util.Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	double avg=findAvg(n);
	System.out.println("Average of the degits: "+avg);
}
public static double findAvg(int n) {
int sum=0;	
	int count=0;
	while(n!=0) {
	int r=n%10;
	n=n/10;
	sum=sum+r;
	count++;
	}
	
	double avg=sum/count;
	return avg;
	
}
}