/*create an array of integer elements , create a method print, pass the array to print method from main method print array elements*/
import java.util.Scanner;
public class PrintHighestNumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size");
	int size=s.nextInt();
	int a[]=new int[size];
	System.out.println("enter the integer numbers");
	for(int i=0;i<size;i++)
	{
		 a[i]=s.nextInt();
	}
	print(a,size);
//	print2(a,size);
	
}
public static void print(int a[],int size)
{
	int high=a[0];
	for(int i=1;i<size;i++)
	{
		if(high<a[i])
		{
			high=a[i];
		}
	}
	System.out.println("highest number is  :"+high);
}
}
