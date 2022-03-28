package Day7;
import java.util.*;

public class Q2 {
	boolean Automorphic(int a)
	{
		int sq=a*a;
		while(a!=0)
		{
			if(a%10!=sq%10)
				return false;
			
				a=a/10;
				sq=sq/10;
			
			
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Q2 q=new Q2();
		System.out.println("Enter the Number");
		int x=s.nextInt();
		System.out.println(q.Automorphic(x)?"Automorphic":"not Automorphic");
		
	}

}
