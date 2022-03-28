package Day7;
import java.util.*;
import java.lang.*;
public class Q1 {
	int count(int x)
	{
		int num=0;
		while(x!=0)
		{
			x=x/10;
			num=num+1;
		}
		return num;
	}
	int sum(int y)
	{
		int temp,total=0;
		while(y!=0)
		{
			temp=y%10;
			total=total+temp;
			y=y/10;
		}
		return total;
				
	}
	float average(int z,int z1)
	{
		float avg=z/z1;	
		return avg;
	}
	public static void main(String[] args) {
		
		Q1 q=new Q1();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number");	
		int a=s.nextInt();
		System.out.println("\nDigit count of Entered Number is -"+q.count(a));
		int c=q.count(a);
		System.out.println("\nSum of Digit of Entered Number is - "+q.sum(a));
		int sum1=q.sum(a);
		System.out.println("\nAverage of Enterd number is - "+q.average(sum1,c));
	}

}
