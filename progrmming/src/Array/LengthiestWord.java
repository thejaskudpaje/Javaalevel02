package Array;
import java.util.ArrayList;
import java.util.Scanner;
public class LengthiestWord {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array :");
	int n=s.nextInt();
	
	String a[]=new String[n];
	System.out.println("\nEnter the array Elements");
	for(int i=0;i<n;i++) {
		 a[i]=s.next();
	}
	
	String re[]=checkLength(a);
	System.out.print("Lengthiest word is :"+re[0]);
}

public static String[] checkLength(String []ar) {
String h=ar[0];
	for(int i=1;i<ar.length;i++) {
	
	if(ar[i].length()>h.length()) {
		h=ar[i];
	}
	}
String []b= {h};
	return b;
}


}
