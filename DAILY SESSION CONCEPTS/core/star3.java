package core;

public class star3 {

	public static void main(String[] args) {
		int count,n=5;
		for(int i=1;i<=n;i++)
		{
			for(count=1;count<=n-i;count++)
			{
				System.out.print("#");
			}
			for(count=1;count<=2*i-1;count++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
