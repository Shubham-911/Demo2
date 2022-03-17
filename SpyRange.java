package pack;

import java.util.Scanner;

public class SpyRange {

	public static void main(String[] args){
		int r1,r2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The range");
		r1=sc.nextInt();
		r2=sc.nextInt();
		System.out.println("Spy numbers between Range "+r1+" "+r2+" are ");
		for(int i=r1;i<r2;i++)
		{
			
			int num=i,sum=0,mul=1,rem;
			while(num!=0)
			{
				rem=num%10;
				sum=sum+rem;
				mul=mul*rem;
				num=num/10;
			}
			if(mul==sum)
				System.out.print(i+" ");
		}
		
	}
}