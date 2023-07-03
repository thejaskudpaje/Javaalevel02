package Array;
/*Define a method to merge to array elements into single array in zig-zag order*/
public class AddArray02 {
public static void main(String[] args) {
	ArrayOperartion ob=new ArrayOperartion();
	System.out.println("Enter the first array");
	int []x=ob.importArray();
	
	System.out.println("Enter the Second array");
	int []y=ob.importArray();
	
	System.out.println("Adding two arrays and printing");
	int []z=ob.merge(x,y);
}
}
