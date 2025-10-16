package core;
import java.util.Scanner;
public class prg5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		 a=a+b;
		 b=a-b;
		 a=a-b;
			
		System.out.println("after swapping:a="+a);
		System.out.println("after swapping:b="+b);
}}
