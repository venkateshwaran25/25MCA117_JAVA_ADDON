package core;
import java.util.Scanner;

public class prg1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
	int m1=a>b? a:b;
	int  m2=m1>c? m1:c;
	int m3=m2>d?m2:d;
	System.out.println("maximun is:"+m3);

	}
	  }


