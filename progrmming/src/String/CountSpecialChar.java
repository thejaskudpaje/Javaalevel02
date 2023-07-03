package String;
/*wjp to retur how many special charecters present in a sentance*/
import java.util.Scanner;

public class CountSpecialChar {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the sentance :");
		String st=s.nextLine();
		
	    int count=countDegit(st);
	    System.out.println("Number of Special characters in a sentance :"+count);
	}
	public static int countDegit(String st) {
		char ch[]=st.toCharArray();
		int count=0,sp_count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0'&&ch[i]<='9'||ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&&ch[i]<='z')
				count++;
			else
				sp_count++;
		}
		return sp_count;
	}
}
