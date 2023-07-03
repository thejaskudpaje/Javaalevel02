package TwoDArray;
import java.util.Scanner;
/*matrix all logic*/
public class Array01 {
	Scanner s=new Scanner(System.in);
public static void main(String[] args) {
	
}

public int[][] readMatrix(){
	System.out.println("Enter the row and column size");
	int row=s.nextInt();
	int col=s.nextInt();
	int[][] mat=new int[row][col];
	
	System.out.println("Enter "+row+"*"+col+"elements");
	for(int i=0;i<mat.length;i++) {
		for(int j=0;j<mat[i].length;j++) {
			mat[i][j]=s.nextInt();
		
		}
		System.out.println();
	}
	return mat;
}

public void display(int[][] mat) {
	for(int i=0;i<mat.length;i++) {
		for(int j=0;j<mat[i].length;j++) {
			System.out.print(mat[i][j]+" ");
		
		}
		System.out.println();
	}
}

public int [][] addMatrix(int[][] a,int[][]b){
	int [][]sum=new int[a.length][a[0].length];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[0].length;j++) {
			sum[i][j]=a[i][j]+b[i][j];
		}
	}
	return sum;
}

public int[][] transposeMat(int [][]a){
	int [][]trnsp=new int[a[0].length][a.length];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[0].length;j++) {
			trnsp[j][i]=a[i][j];
		}
	}
	return trnsp;
}

public int[] evenOddCount(int [][]eo) {
	int ec=0, oc=0;
	for(int i=0;i<eo.length;i++) {
		for(int j=0;j<eo[0].length;j++) {
			if(eo[i][j]%2==0)
				ec++;
			else
				oc++;
		}
	}
	int []count= {ec,oc};
	return count;
}


}
