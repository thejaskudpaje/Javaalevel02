package Array;
import java.util.Scanner;
public class ArrayOperartion {
public int[] importArray()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the array size :");
	int n=s.nextInt();
	System.out.println("Enter the array elements :");
	int []ar=new int[n];
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=s.nextInt();
	}
	return ar;
}

public void display(int []ar) {
	for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]+"  ");
	}
}

public int[] merge(int []a,int []b) {
	int []c=new int[a.length+b.length];
	for(int i=0;i<a.length;i++) {
		c[i]=a[i];
	}
	
	for(int i=0;i<b.length;i++) {
		c[a.length+i]=b[i];
	}
	return c;
}


}
