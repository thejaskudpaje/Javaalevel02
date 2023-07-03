package programming;
/*WJP to read month number from user and print how many days pesent in that month*/
import java.util.Scanner;
public class DaysInTheMonth {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the month number");
	int m=s.nextInt();
	switch(m)
	{
	case 1:System.out.println("January month Contains 31 Days");break;
	case 2:System.out.println("February month Contains 28 or 29 Days");break;
	case 3:System.out.println("March month Contains 31 Days");break;
	case 4:System.out.println("April month Contains 30 Days");break;
	case 5:System.out.println("May month Contains 31 Days");break;
	case 6:System.out.println("June month Contains 30 Days");break;
	case 7:System.out.println("July month Contains 31 Days");break;
	case 8:System.out.println("August month Contains 30 Days");break;
	case 9:System.out.println("September month Contains 31 Days");break;
	case 10:System.out.println("October month Contains 30 Days");break;
	case 11:System.out.println("November month Contains 31 Days");break;
	case 12:System.out.println("December month Contains 30 Days");break;
	default : System.out.println("Invalid month number");
	}
}
}
