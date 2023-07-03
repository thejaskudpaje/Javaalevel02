package Armstrong;

import java.util.Scanner;

/*WJP to check any number armstrong or not*/
public class CheckArmstrong {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		boolean rs=checkArmstrong(n);
		if(rs)
			System.out.println("Armstrong number");
		else
			System.out.println("Not armstrong");
	}
	public static boolean checkArmstrong(int n) {
		int sum=0; 
		int temp=n;
		int deg=getDegits(n);
		
		while(n!=0)
		{
			int r=n%10;
			sum=sum+pow(r,deg);
			n=n/10;
		}
		
		return temp==sum;
	}
	
	public static int getDegits(int x) {
		int count=0;
		
		do
		{
			x=x/10;
			count++;
			
		}while(x!=0);
			return count;
	}
	
	public static int pow(int r, int deg) {
		int prod=1;
		while(deg>0)
		{
			prod=prod*r;
			deg--;
		}
		return prod;
	}

}
