package Assignment;

public class Q14 {
 void With3(int a,int b)
 {
	 System.out.println("Divided by 3");
	 for(int i=a;i<=b;i++)
	 {
		 if(i%3==0)
			 System.out.print(i+"  ");
	 }
 }
 void With5(int a,int b)
 {
	 System.out.println("\n\nDivided by 5");
	 for(int i=a;i<=b;i++)
	 {
		 if(i%5==0)
			 System.out.print(i+"  ");
	 }
 }
 void Both3And5(int a,int b)
 {
	 System.out.println("\n\nDivided by both 3 and 5");
	 for(int i=a;i<=b;i++)
	 {
		 if(i%3==0 && i%5==0)
			 System.out.print(i+"  ");
	 }
 }
 
	public static void main(String[] args) {
		Q14 q=new Q14();
		q.With3(1,100);
		q.With5(1,100);
		q.Both3And5(1,100);
	}

}
