package patterns;

import java.util.Scanner;

public class prg1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many rows:");
		int rows=sc.nextInt();
		int numbers=1;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(numbers+" ");
				numbers++;
			}
			System.out.println();
		}

	}

}
