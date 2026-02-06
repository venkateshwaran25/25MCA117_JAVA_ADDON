package patterns;

import java.util.Scanner;

public class heartpattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size for heart shape(6 to 12):");
		int rows=sc.nextInt();
		
		for(int i=rows/2;i<=rows;i+=2)
		{
			for(int j=1;j<rows-i;j+=2)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=rows-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = rows; i >= 1; i--)
		{
			//print spaces
			for(int j = i; j < rows; j++) 
			{
				System.out.print("  ");
			}
			//print star
			for(int k = 1; k <= 2*i-1; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
