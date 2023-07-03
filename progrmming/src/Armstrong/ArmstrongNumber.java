package Armstrong;
/*number of armstrong number within 100-1000*/

public class ArmstrongNumber {
public static void main(String[] args) {
	int count=armstrongCount();
	System.out.println("total Three degit amstron numbers :"+count);
}
public static int armstrongCount() {
	System.out.println("Armstrong numbers are");
	int count=0;
	for(int i=100;i<1000;i++)
	{
		int temp=i;
		int sum=0;
		while(temp>0)
		{
			int d=temp%10;
			sum=sum+d*d*d;
			temp=temp/10;
		}
		if(sum==i)
		{
			System.out.println(i);
			count++;
		}
	}
	return count;
}
}
