package Conversion;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Binary number");
		int bin=s.nextInt();
		int dec=binToDec(bin);
		System.out.println("Octa Binary value is : "+dec);
	}
	public static int binToDec(int bin) {
		int sum=0; 
		int pow=1;
		do {
			int r=bin%10;
			sum=sum+r*pow;
			pow=2*pow;
			bin=bin/10;
		}while(bin!=0);
		return sum;
		}
}
