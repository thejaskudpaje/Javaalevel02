package HappyNumber;
/*WJP to count the happy numbers within the range*/
import java.util.Scanner;
public class CountHappyNumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the range");
	int range=s.nextInt();
	int count=countHappyNumber(range);
	System.out.println("Number of happy numbers: "+count);
}
public static int countHappyNumber(int range) {
	System.out.println("Happy numbers are");
	int count=0;
	for(int i=0;i<=range;i++) {
		while(i>9)
		{int sum=0;
			do
			{
				int d=i%10;
				sum=sum+d*d;
				i/=10;
			}while(i!=0);
			i=sum;
		}
		if(i==1||i==7)
			count++;
		
	}
	return count;
}
}
