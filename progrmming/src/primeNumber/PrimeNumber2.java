package primeNumber;
/*wjp to define how many prime numbers there withing the range n*/
import java.util.Scanner;
public class PrimeNumber2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=s.nextInt();
		int count=printPrime(range);
		System.out.println("number of prime nubers within range: "+range+"\n"+count);
	}
public static int printPrime(int range) {
	//System.out.println("prime numbers within range "+range+" are ");
	int count=0;
	for(int n=2;n<=range;n++)
	{
		int prime=0;
		for(int m=1; m<=n;m++)
		{
			if(n%m==0)
			{
				prime++;
			}				
		}
		if(prime==2)
			count++;
			
}
return count;
}
}
