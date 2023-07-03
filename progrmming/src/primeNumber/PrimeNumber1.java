package primeNumber;
/*wjp to print prime numbers within n*/
import java.util.Scanner;
public class PrimeNumber1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=s.nextInt();
		printPrime(range);
	}
public static void printPrime(int range) {
	System.out.println("prime numbers withis range "+range+" are ");
	for(int n=2;n<=range;n++)
	{
		int count=0;
		for(int m=1; m<=n;m++)
		{
			if(n%m==0)
			{
				count++;
			}
				
		}
		if(count==2)
			System.out.println(n);
}

}
}
