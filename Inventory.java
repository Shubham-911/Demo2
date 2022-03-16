package pack;
import java.util.*;
public class Inventory {
	
	String name;
	int price;
	int quantity;
	static String banner="Welcome to ISM";
	void displayBanner()
	{
		System.out.println(banner);
	}
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter price");
		price=sc.nextInt();
		System.out.println("Enter Quantity");
		quantity=sc.nextInt();
		}
	void show()
	{
		System.out.println("Name="+name+"\nPrice="+price+"\nquantity"+quantity);
		
	}
	void discount()
	{
		if(price>3000)
			System.out.println("you are elegible for 10% discount");
		else
			System.out.println("you are elegible for 9% discount");
		
	}
	

	public static void main(String[] args) {
		Inventory p=new Inventory();
		p.displayBanner();
		p.input();
		p.show();
		p.discount();
	

}
}
