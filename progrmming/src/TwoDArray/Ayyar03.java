package TwoDArray;
/*Reading matrix,display matrix, transpose matrix, even and odd count*/ 
public class Ayyar03 {
	public static void main(String[] args) {
		Array01 ob=new Array01();
		System.out.println("Enter the  matrix");
		int [][]a=ob.readMatrix();
	
		
		System.out.println("Displaying the matrix");
		ob.display(a);
		
		
		//System.out.println("Adding matrix");
		int [][]trnsp=ob.transposeMat(a);
		System.out.println("Displaying transpose matrix");
		ob.display(trnsp);
		
		int [] count=ob.evenOddCount(a);
		System.out.println("Even numbers count :"+count[0]);
		System.out.println("odd numbers count :"+count[1]);
		
	}
}
