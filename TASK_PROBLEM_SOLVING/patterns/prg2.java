package patterns;

import java.util.Scanner;

public class prg2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many rows:");
		int rows=sc.nextInt();
		
		for(int i=0;i<rows;i++)
		{
			int numbers=1;
			for(int j=0;j<rows-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(numbers+" ");
				numbers=numbers*(i-k)/(k+1);
			}
			System.out.println();
		}

	}

}
