package progrmming;
/*wjp to return sum of suare of degits*/
import java.util.Scanner;
public class SumOfSquare {
public static void main(String[] args) {
	java.util.Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	int sum=findSum(n);
	System.out.println("sum of the degits: "+sum);
}
public static int findSum(int n) {
	int sum=0;
	
	
	
	while(n!=0) {
	int r=n%10;
	n=n/10;
	sum=sum+(r*r);
	}
	return sum;
}
}

