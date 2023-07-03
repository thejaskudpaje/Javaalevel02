/*create an integer array, store elements check 100 is present 
in the array or not 
if yes print yes, if no print no*/
public class DivisibleByHundred {
	public static void main(String []args) {
		int a[]= {10,50,60,50,100};
		for(int i=0;i<5;i++)
		{
			if(a[i]%100==0)
			{
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		
		}
	}
}
