package DisariumNumber;
/*WJP count disarium number within the range*/
import java.util.Scanner;
public class CountDisarium {
public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the lower limit");
   int l=s.nextInt();
   System.out.println("Enter the higher limit");
   int u=s.nextInt();
   int count=countDisarium(l,u);
   System.out.println("Number of Disarium within the imit :"+count);
}
public static int countDisarium(int l, int u) {
	int count=0;
	System.out.println("Disarium numbers are");
	for(int i=l;i<=u;i++)
	{
		boolean b=isDisarium(i);
		if(b)
		{
			System.out.println(i);
			count++;
		}
	}
	return count;
}

public static boolean isDisarium(int n) {
	int deg=countDegits(n);
	int temp=n;
	int sum=0;
	
	while(n!=0)
	{
		int r=n%10;
		sum=sum+pow(r,deg);
		n=n/10;
		deg--;
	}
	return temp==sum;
}

public static int countDegits(int x) {
	int count=0;
	
	do {
		x=x/10;
		count++;
	}while(x!=0);
	return count;
}

public static int pow(int r, int deg) {
	int prod=1;
		while(deg>0){
			prod=prod*r;
			deg--;
		}
		return prod;
}
}
