package Array;
/*merge already sorted array into sorted format*/
public class AddArray04 {
	public static void main(String[] args){ 
		ArrayOperartion ob=new ArrayOperartion();
		System.out.println("Enter the first array");
		int []x=ob.importArray();
		
		System.out.println("Enter the Second array");
		int []y=ob.importArray();
		
		int []q=sort(x,y);
		System.out.println("\nPrinting after sorting");
		ob.display(q);
	}

	public static int[] sort(int []a,int[]b) {
		int c[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length&&j<b.length) {
			if(a[i]<b[i]) {
				c[k++]=a[i++];
			}
			else
				c[k++]=b[j++];
		}
		while(i<a.length) {
			c[k]=a[i];
			k++;
			i++;
		}
		while(j<b.length) {
			c[k]=b[j];
			j++;
			k++;
		}
		return c;
	}
}

