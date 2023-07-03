package String;
/*wjp to count number of degits in a sentance*/
import java.util.Scanner;

public class CountDegits {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the sentance :");
		String st=s.nextLine();
		
	    int count=countDegit(st);
	    System.out.println("Number of degits in a sentance :"+count);
	}
	public static int countDegit(String st) {
		char ch[]=st.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0'&&ch[i]<='9')
				count++;
		}
		return count;
	}
}
