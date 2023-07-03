package progrmming;
/*define a method to return product of the degits*/
import java.util.Scanner;
public class ProductOfDegits {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	int prod=product(n);
	System.out.println("Product of the degits:"+prod);
}
public static int product(int n)
{
	int prod=1;
	while(n!=0)
	{
		int r=n%10;
		prod=prod*r;
		n=n/10;
	}
	return prod;
}
}
