package Day7;
import java.util.*;

public class Q3 {

	public static void main(String[] args){
		int num,r,n,sum=0,product=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number");
		num=sc.nextInt();
		n=num;
		while(n!=0)
		{
		r=n%10;
		sum=sum+r;
		product=product*r;
		n=n/10; 
		}
			if(product==sum)
				System.out.println(num+" is a Spy number");
			else
				System.out.println(num+" is not Spy numbber ");
	}
		

	}


