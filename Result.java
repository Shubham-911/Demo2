package pack;
import java.util.*;

public class Result {
	double mark;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks \n ");
		mark=sc.nextInt();
	}
	void check_result()
	{
		String a=mark>40 ? "Pass" :" Fail ";
		System.out.println(a+"\n");
	}

	public static void main(String[] args) {
		Result r=new Result();
		r.input();
		r.check_result();
		

	}

}
