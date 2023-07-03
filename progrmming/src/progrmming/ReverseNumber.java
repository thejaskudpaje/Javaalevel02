package progrmming;
/*define a method to defind the reverse of the number*/
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		long n=s.nextLong();
		long m=reverse(n);
		System.out.println("reverse : "+m);
	}
public static long reverse(long n) {
	long rev=0;
	
	while(n!=0)
	{
		long r=n%10;
		rev=rev*10+r;
		n=n/10;
	}
	return rev;
}
}
