package Array;
/*Define a method to add two integer type array into single array*/
public class AddArray01 {
public static void main(String[] args){ 
	ArrayOperartion ob=new ArrayOperartion();
	System.out.println("Enter the first array");
	int []x=ob.importArray();
	
	System.out.println("Enter the Second array");
	int []y=ob.importArray();
	
	System.out.println("Adding two arrays and printing");
	int []z=merge(x,y);
	ob.display(z);
}

public static int[] merge(int []a,int []b) {
	int []c=new int[a.length+b.length];
	int j=0;
	for(int i=0;i<a.length+b.length;i+=2) {
		
		c[i]=a[j];
		j++;
	}
	j=0;
	for(int i=1;i<a.length+b.length;i+=2) {
		c[i]=b[j];
		j++;
	}
	return c;
}
}
