
/*create an integer array, store elements check 100 is present 
in the array or not 
if yes print yes, if no print no*/
import java.util.Scanner;
public class HundredPresentOrNot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("enter the numbers");
	for(int i=0;i<size;i++) {
		
		a[i]=sc.nextInt();
	}
	boolean b=false;
	for(int i=0;i<size;i++) {
		if(a[i]==100) {
			b=true;
			//System.out.println("Hundred is present");
		}
	
	}
	if(b==true) {
		System.out.println("Hundred is present");
	}
	else {
		System.out.println("Hundred not present");
	}
}
}
