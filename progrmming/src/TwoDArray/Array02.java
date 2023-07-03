package TwoDArray;
/*Reading matrix,display matrix, add matrix*/ 
public class Array02 {
public static void main(String[] args) {
	Array01 ob=new Array01();
	System.out.println("Enter the first matrix");
	int [][]a=ob.readMatrix();
	System.out.println("Enter the second matrix");
	int [][]b=ob.readMatrix();
	
	System.out.println("Displaying first matrix");
	ob.display(a);
	System.out.println("Displaying second matrix");
	ob.display(b);
	
	System.out.println("Adding matrix");
	int [][]sum=ob.addMatrix(a,b);
	System.out.println("Displaying Added matrix");
	ob.display(sum);
	
	
}
}
