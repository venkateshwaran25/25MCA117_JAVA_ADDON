package conditionalstatements;

import java.util.Scanner;

public class calculator {
//	9. Switch Case Calculator
//	   Build a calculator using switch case.
//	   Sample Input: 5 + 2
//	   Sample Output: 7


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a,b,d;
		System.out.println("enter inputs");
		a=sc.nextInt();
		b=sc.nextInt();
		char c=sc.next().charAt(0);
	
		
		switch(c)
		{
		case '+':
		{
			d= a+b;
			System.out.println("Output:"+d);
			break;
		}
		case '-':
		{
			d=a-b;
			System.out.println("Output:"+d);
			break;
		}
		case '*':
		{
			d=a*b;
			System.out.println("Output:"+d);
			break;
		}
		case '%':
		{
			d=a%b;
			System.out.println("Output:"+d);
			break;
		}
		default:
			System.out.println("invalid input");
		}

	}

}
