package strongNumber;
/*wjp for strong number within the range*/
import java.util.Scanner;
public class StrongNumberInRange {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=s.nextInt();
		strong(range);
	}
public static void strong(int range) {
	for(int i=1;i<=range;i++)
	{
		int temp=i;
		int sum=0;
		while(temp!=0)
		{
			int r=temp%10;
			sum=sum+getfact(r);
			temp=temp/10;
		}
		if(i==sum)
			System.out.println(i);
	}
}

public static int getfact(int r) {
	int fact=1;
	while(r>0)
	{
		fact=fact*r;
		r--;
		
	}
	return fact;
}
}
