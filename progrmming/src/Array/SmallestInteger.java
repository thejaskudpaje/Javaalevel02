package Array;
import java.util.Scanner;
public class SmallestInteger {
public static void main(String[] args) {
	System.out.print("Enter the sie of the array: ");
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	int a[]=new int[size];
	
	for(int i=0;i<size;i++) {
		a[i]=s.nextInt();
	}
	
	int small=getSmallest(a);
	System.out.println(small);
}
public static int getSmallest(int a[]) {
	int small=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]<small)
			small=a[i];
	}
	return small;
}
}
