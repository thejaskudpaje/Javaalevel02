package Conversion;

import java.util.Scanner;

public class DecimalToOctal {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Decimal number");
		int dec=s.nextInt();
		String oct=decToOct(dec);
		System.out.println("Octa Decimal value is : "+oct);
	}
	
	public static String decToOct(int dec) {
		String s="";
		do {
			int r=dec%8;
			s=r+s;
			dec=dec/8;
		}while(dec!=0);
		return s;
	}
}
