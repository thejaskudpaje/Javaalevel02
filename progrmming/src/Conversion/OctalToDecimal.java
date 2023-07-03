package Conversion;

import java.util.Scanner;

public class OctalToDecimal {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Octal number");
		int oct=s.nextInt();
		int dec=octToDec(oct);
		System.out.println("Octa Binary value is : "+dec);
	}
	
	public static int octToDec(int oct)
	{
		int sum=0;
		int pow=1;
		do {
			int r=oct%10;
			sum=sum+r*pow;
			pow=pow*8;
			oct=oct/10;
		}while(oct!=0);
		return sum;
	}

}
