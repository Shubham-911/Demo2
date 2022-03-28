package Assignment;
import java.util.*;

public class Q16c{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int k=1;
		System.out.println("Enter the number of Rows ");
		int l=s.nextInt();
		for(int i=1;i<=l;i++)
		{
			for(int j=1;j<=i;j++,k++)
			{
				System.out.print(k+"  ");
			}
			System.out.println("");
		}
	}

}
