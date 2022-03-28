package Assignment;
import java.util.*;

public class Q13 {
	double Area(double a,double b)
	{
		return (a*b);
	}
	double perimeter(double a,double b)
	{
		return 2*(a+b);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Q13 q=new Q13();
		System.out.println("Enter the Width of Rectangle");
		double x=s.nextDouble();
		System.out.println("Enter the Length of Rectangle");
		double y=s.nextDouble();
		System.out.println("Area is "+x+" * "+y+" = "+q.Area(x,y));
		System.out.println("Perimeter is 2 *( "+x+" + "+y+" ) = "+q.perimeter(x,y));
	}
}