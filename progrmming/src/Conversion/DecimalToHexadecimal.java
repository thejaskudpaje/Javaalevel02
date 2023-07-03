package Conversion;

import java.util.Scanner;

public class DecimalToHexadecimal {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Decimal number");
		int dec=s.nextInt();
		String hex=decTohex(dec);
		System.out.println("Octa Decimal value is : "+hex);
	}
	public static String decTohex(int dec) {
		String s="";
		do {
			int r=dec%16;
			if(r<10) 
				s=r+s;
			else
				s=(char)(55+r)+s;
			dec=dec/16;
			
		}while(dec!=0);
		return s;
	}
}
