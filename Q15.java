package Assignment;
import java.util.*;

public class Q15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int temp;
		System.out.println("Enter the 1st Number");
		int x=s.nextInt();
		System.out.println("Enter the 2nd Number");
		int y=s.nextInt();
		System.out.println("Entered the numbers are a="+x+" and b="+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("\nNow the Swapped numbers are a="+x+" and b="+y);
	}

}
