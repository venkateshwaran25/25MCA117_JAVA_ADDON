package core;

import java.util.Scanner;

public class star {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows;
		System.out.println("enter no. of rows:");
		rows=sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			//space controlling
			for(int j=1;j<rows;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
