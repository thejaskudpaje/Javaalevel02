package String;
/*wjp to define a method to print the avg of degits in the String*/
import java.util.Scanner;

public class SumOfDegits {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the sentance :");
		String st=s.nextLine();
		
	    int avg=countDegit(st);
	    System.out.println("Avearge of degits :"+avg);
	}
	public static int countDegit(String st) {
		char ch[]=st.toCharArray();
		int sum=0,count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0'&&ch[i]<='9')
				sum=sum+(ch[i]-48);
			count++;
		
		}
		return sum/count;
	}
}
