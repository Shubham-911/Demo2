package pack;
import java.util.*;

public class Vowel {

	public static void main(String[] args) {
		char ch;int i=1;
		Scanner sc=new Scanner(System.in);
		for(i=1;i>0;i++)
		{
		i=0;
		System.out.println("Enter the character\n ");
		ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':i++;
		
		}
		if(i==1)
		System.out.println(ch+" is Vowel\n");
		else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
			System.out.println(ch+"  is Consonent\n");
		else
			System.out.println("Not an Alphabet\n");
			
		
		}
	}

}
