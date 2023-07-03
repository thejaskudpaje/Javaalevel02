package Palindrome;
/*wjp to print 3 degit palindrome*/
import java.util.Scanner;
public class ThreeDegitPalindrome {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter the range");
	int range=s.nextInt();
	palindrome(range);
}
public static void palindrome(int range){
	System.out.println("pallindrome numbers");
	
	for(int k=100;k<=range;k++)
	{
		int rev=0;
	int temp=k;
		while(temp>0)
		{
			int r=temp%10;
			rev=rev*10+r;
			temp=temp/10;
		}
		if(rev==k)
			System.out.print(k+" ");
	}
}
}
