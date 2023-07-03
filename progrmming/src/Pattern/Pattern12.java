package Pattern;

public class Pattern12 {
public static void main(String[] args) {
	int x=1;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			System.out.print(x+" ");
			x++;
			if(x>9)
				x=1;
		}
		System.out.println();
	}
}
}
