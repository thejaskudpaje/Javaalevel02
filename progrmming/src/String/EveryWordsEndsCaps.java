package String;
/*wjp to convert every word ends with upper case in a senetance*/
import java.util.Scanner;
public class EveryWordsEndsCaps {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the sentance :");
	String st=s.nextLine();
	
	String res=convert(st);
	System.out.println("Converted string is");
	System.out.println(res);
}

public static String convert(String st) {
	char ch[]=st.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(ch[i]==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ') {
			if(ch[i]>='a'&&ch[i]<='z') {
				ch[i]=(char)(ch[i]-32);
			}
		}
	}
	st=new String(ch);
	return st;
}
}
