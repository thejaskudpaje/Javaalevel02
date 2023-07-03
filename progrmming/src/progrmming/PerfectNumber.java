package progrmming;
/*Define a method to return how many perfect numbers within range*/
import java.util.Scanner;
public class PerfectNumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the range");
	int range=s.nextInt();
	int count=excecute(range);
	System.out.println(count +" Perfect numbers there within the range "+range);
}

public static int excecute(int range) {
	int count=0;
	for(int n=1; n<range; n++)
	{
		int sum=0;
		for(int i=1; i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(sum==n)
		count ++;
		
	}
	return count;
}
}
