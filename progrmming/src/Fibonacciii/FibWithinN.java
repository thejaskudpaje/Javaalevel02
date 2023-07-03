package Fibonacciii;
/*wjp to print all the fibonaccii numbers within n*/

import java.util.Scanner;
public class FibWithinN {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the limit");
	int n=s.nextInt();
	printFib(n);
	
}
public static void printFib(int n) {
	int f1=0,f2=1;
	while(f1<=n) {
		System.out.print(f1+" ");
		int f3=f1+f2;
		f1=f2;
		f2=f3;
	}
}
}
