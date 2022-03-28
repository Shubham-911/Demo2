package Assignment;
import java.util.*;
import java.lang.*;

public class Q19{
	String name;
	int q,p,p1;
	static String Collagename;
	void Input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Collagename");
		Collagename=s.nextLine();
		System.out.println("Enter the BookName");
		name=s.nextLine();
		System.out.println("Enter the Quantity");
		q=s.nextInt();
		
	}
	int checkPrice()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the price");
		p=s.nextInt();
		return p;
	}
	void Display()
	{
		System.out.println("\nBookName- "+name+"\nQuantity- "+q+"\nPrice- "+p1);
		
	}
	void Discount(int d)
	{
		if(d>=5000)
			System.out.println("Discount is Rupee 200");
		else
			System.out.println("Discount is Rupee 100");
	}
	public static void main(String[] args) {
		Q18 b=new Q18();
		b.Input();
		int p1=b.checkPrice();
		b.Display();
		b.Discount(p1);
		
	}

}
