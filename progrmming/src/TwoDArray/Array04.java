package TwoDArray;
/*row and column wise biggest and smallest number*/
public class Array04 {
public static void main(String[] args) {
	Array01 ob=new Array01();
	System.out.println("Enter the  matrix");
	int [][]a=ob.readMatrix();

	
	System.out.println("Displaying the matrix");
	ob.display(a);
	
	System.out.println("Biggest in row wise");
	int []res=biggRow(a);
	for(int i=0;i<a.length;i++) {
		System.out.println((i+1)+" row Biggest number :"+res[i]);
	}
	System.out.println();
	int rs[]=smallCol(a);
	for(int i=0;i<a[0].length;i++) {
		System.out.println((i+1)+" Column smallest number :"+rs[i]);
	}
}

public static int[] biggRow(int [][]a) {
	int big[]=new int[a.length];
	for(int i=0;i<a.length;i++) {
		big[i]=a[i][0];
		for(int j=1;j<a[i].length;j++) {
			if(a[i][j]>big[i])
				big[i]=a[i][j];
		}
	}
	return big;
}

public static int[] smallCol(int [][]a) {
	int small[]=new int[a[0].length];
	for(int i=0;i<a[0].length;i++) {
		small[i]=a[0][i];
		for(int j=1;j<a.length;j++) {
			if(a[j][i]<small[i])
				small[i]=a[j][i];
		}
	}
	return small;
	
}
}
