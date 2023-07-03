package Fibonacciii;
/*wjp to return nth fibonaccii*/
import java.util.Scanner;

public class ReturnNthFibonaccii {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		int b=printFib(n);
		System.out.println(b);
		
		
	}
	public static int printFib(int n) {
		int f1=0,f2=1;
		while(n>1) {
			
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
		}
		return f1;
	}
}
