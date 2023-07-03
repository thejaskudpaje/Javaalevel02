package Conversion;
import java.util.Scanner;
public class DecimalToBinary {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Decimal number");
	int dec=s.nextInt();
	String bin=decToBin(dec);
	System.out.println("Binary value is : "+bin);
}

public static String decToBin(int dec) {
	String s="";
	do {
		int r=dec%2;
		s=r+s;
		dec=dec/2;
	}while(dec!=0);
	return s;
}
}
