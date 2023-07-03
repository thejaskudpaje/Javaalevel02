package Pattern;
import java.util.Scanner;
public class Pattern13 {
public static void main(String[] args) {
	System.out.println("Enter the name");
	Scanner s=new Scanner(System.in);
	String st=s.next();
	int n=st.length();
	for(int i=1;i<=n;i++) {
		for(int j=0;j<i;j++) {
			System.out.print(st.charAt(j)+" ");
		}
		System.out.println();
	}
}
}
