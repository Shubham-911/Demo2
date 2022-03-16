package pack;
import java.util.*;

public class FindGreaterNum {
	int a,b;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Two Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	void check()
	{
		if(a>b)
			System.out.println("Number "+a+" is greater than "+b);
		else
			System.out.println("Number "+b+" is greater than "+a);
			
	}
	public static void main(String[] args) {
		FindGreaterNum n=new FindGreaterNum();
		n.input();
		n.check();
	
}
}
