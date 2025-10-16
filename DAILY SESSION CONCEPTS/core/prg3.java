package core;
import java.util.Scanner;
public class prg3{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		char c=sc.next().charAt(0);
		if(c>='a' && c<='z' || c>='A' && c<='Z')		
		{
			System.out.println("alphabet");
			
		}
		else
		{
			System.out.println("invalid");
		}

	}

}
