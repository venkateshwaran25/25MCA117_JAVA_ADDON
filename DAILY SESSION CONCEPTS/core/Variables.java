package core;
import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//		byte a;
//		short b;
//		int c;
//		long d;
//		float e;
//		double f;
//		boolean h;
//		char g;
//		System.out.println("enter byte input");
//		a=in.nextByte();
//		System.out.println("enter short input");
//		b=in.nextShort();
//		System.out.println("enter int input");
//		c=in.nextInt();
//		System.out.println("enter long input");
//		d=in.nextLong();
//		System.out.println("enter float input");
//		e=in.nextFloat();
//		System.out.println("enter double input");
//		f=in.nextDouble();
//		System.out.println("enter char input");
//		g=in.next().charAt(0);
//
//		System.out.println("enter boolean input");
//		h=in.nextBoolean();
//System.out.println("enter string input");
//in.nextLine();
//String i=in.nextLine();
////print the output
//System.out.println("byte value:" +a);
//System.out.println("short value:" +b);
//System.out.println("int value:" +c);
//System.out.println("long value:" +d);
//System.out.println("float value:" +e);
//System.out.println("double value:" +f);
//System.out.println("char value:" +g);
//System.out.println("boolean value:" +h);
	
int age,rollno;
String name,nat;
char gender;

System.out.println("enter age");
age=in.nextInt();


System.out.println("enter gender");
gender=in.next().charAt(0);
System.out.println("enter name");
in.nextLine();
name=in.nextLine();
System.out.println("enter roll no");
rollno=in.nextInt();
System.out.println("enter native");
in.nextLine();
nat=in.nextLine();

System.out.println("age is "+age);
System.out.println("name is "+name);
System.out.println("gender is "+gender);
System.out.println("native  is "+nat);
System.out.println("roll no  is "+rollno);

}
}