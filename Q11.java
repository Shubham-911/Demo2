package Assignment;
import java.util.*;


public class Q11 {
	void Print()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Even Number between 1300 to 2300 are -");
		for(int i=1300;i<=2300;i++)
		{
			if(i%2==0)
				System.out.print(i+"  ");
		}
	}

	public static void main(String[] args) {
		Q11 q=new Q11();
		q.Print();
	}

}
