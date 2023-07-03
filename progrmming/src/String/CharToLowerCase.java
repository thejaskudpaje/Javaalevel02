package String;
/*wjp to convert all the charecter to lower case without using built in methids */
import java.util.Scanner;
public class CharToLowerCase {
public static void main(String[] args) {
	System.out.println("Enter the word ");
	Scanner s=new Scanner(System.in);
	
	String st=s.nextLine();
	convert(st);
}
public static void convert(String st) {
	char c[]=st.toCharArray();
	for(int i=0;i<c.length;i++) {
		if(c[i]>='A'&&c[i]<='Z') {
			/*int j=(int)c[i];
			c[i]=(char)(j+32);
			System.out.println(c[i]);*/
			c[i]=(char)(c[i]+32);
			
		}
		
	}
	st=new String(c);
	System.out.println(c);
	String s=String.copyValueOf(c);
	System.out.println(c);
}
}
