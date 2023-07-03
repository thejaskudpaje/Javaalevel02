package progrmming;
import java.util.Scanner;
public class CheckDate {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the date(dd mm yy)");
		int dd=s.nextInt();
		int mm=s.nextInt();
		int yy=s.nextInt();
		
	boolean b=check(dd,mm,yy);
	if(b==true)
		System.out.println("Valid date");
	else
		System.out.println("Invalid");
	}
	public static boolean check(int dd, int mm, int yy) {
		if((dd<1||dd>31)||(mm<1||mm>12)||yy<1)
			return false;
		else if((mm==2||mm==4||mm==6||mm==9||mm==11)&&dd>30)
			return false;
		else if(mm==2&&dd>29)
			return false;
		else if(((yy%4==0&&yy%100==0)||yy%400==0)==false &&(mm==2&&dd>28))
			return false;
		else
			return true;
		
					
		}
		
	}


