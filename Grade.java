package pack;
import java.util.*;

public class Grade {

	public static void main(String[] args) {
		int mark;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the marks\n");
		mark=sc.nextInt();
		if(mark>=80)
		{
			System.out.println("\nGrade A\n");		
		}else if(mark>=60 && mark<80)
		{
			System.out.println("\nGrade B\n");		
		}else if(mark>=50 && mark<60)
		{
			System.out.println("\nGrade C\n");
		}
		else if(mark>=45 && mark<50)
		{
			System.out.println("\nGrade D\n");		
		}else if(mark>=25 && mark<45)
		{
			System.out.println("\nGrade E\n");		
		}
		else 
		{
			System.out.println("\nGrade F\n");		
		}




		
	}

}
