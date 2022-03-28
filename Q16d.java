package Assignment;
import java.util.*;

public class Q16d {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char k='D';
		
		for(int i=1;i<=4;i++)
		{
			k='D';
			for(int j=4;j>=i;j--,k--)
			{
				System.out.print(k+" ");
			}
			System.out.println("");
		}
	}

}
