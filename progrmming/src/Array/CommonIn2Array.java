package Array;

public class CommonIn2Array {
	public static void main(String[] args){ 
		ArrayOperartion ob=new ArrayOperartion();
		System.out.println("Enter the first array");
		int []x=ob.importArray();
		
		System.out.println("Enter the Second array");
		int []y=ob.importArray();
		
		int c[]=commonElement(x,y);
		
		ob.display(c);
}
	public static int[] commonElement(int a[],int b[]) {
		int d[]=new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					d[k]=a[i];
					k++;
					break;
				}
			}
		}
		int []ar=new int[k];
		for(int i=0;i<k;i++) {
			ar[i]=d[i];
		}
		return ar;
	}
}