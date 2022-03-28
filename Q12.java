package Assignment;

public class Q12 {
	void Prime()
	{
		int prime;
		for(int i=2;i<=20;i++)
		{
			if(i==0 || i==1)
				continue;
				
			prime=1;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					prime=0;
					break;
				}
			}
			if(prime==1)
				System.out.print(+i+" ");
		}
	}

	public static void main(String[] args) {
		Q12 q=new Q12();
		System.out.println("The prime numbers between 2 to 20 are-\n");
		q.Prime();
	}

}
