/*create an array of unteger elements , create a method print, pass the array to print method from main method print rray elements*/
public class PrintLowerNumber {
public static void main(String[] args) {
	int a[]= {10,52,15,25,12};
	print(a);
}
	public static void print(int a[]) 
	{
		int min=a[0];
		for(int i=1;i<5;i++) 
		{
			if(min>a[i]) 
			{
				min=a[i];
				
			}
		}
		System.out.println("lowest number is :"+min);
	}


}
