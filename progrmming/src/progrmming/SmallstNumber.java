package progrmming;
import java.util.Scanner;
public class SmallstNumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter 3 numbers");
	double a=s.nextDouble();
	double b=s.nextDouble();
	double c=s.nextDouble();
	
	double small=cal(a,b,c);
	System.out.println("smallest number is "+small);
}

public static double cal(double a,double b,double c) {
	double small=(a<b&&a<c)?a:(b<c)?b:c;
	return small;
}
}
