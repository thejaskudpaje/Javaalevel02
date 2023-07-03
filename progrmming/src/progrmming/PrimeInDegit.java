package progrmming;
/*wjp to prime degits in the number*/
import java.util.Scanner;
public class PrimeInDegit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int count=countprime(n);
		System.out.println("Prime numbers :"+count);
	}
public static int countprime(int n) {
	int countprime=0;
	while(n!=0)
	{
		int r=n%10;
		if(r==2||r==3||r==5||r==7)
			countprime++;
		n=n/10;
	}
	return countprime;
}
}
