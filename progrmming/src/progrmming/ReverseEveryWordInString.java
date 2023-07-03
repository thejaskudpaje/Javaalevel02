package progrmming;

public class ReverseEveryWordInString {
public static void main(String[] args) {
	String s1="My name is thejas";
	String s2="";
	String sa[]=s1.split(" ");
	
	for(int i=0; i<sa.length;i++) {
		char ar[]=sa[i].toCharArray();
	int j=0;
	int k=ar.length-1;
	while(j<k) {
		char temp=ar[j];
		ar[j]=ar[k];
		ar[k]=temp;
		j++;
		k--;
	}
	String s3=new String(ar);
	s2=s2+" "+s3;
	}
	System.out.println(s2);
}
}
