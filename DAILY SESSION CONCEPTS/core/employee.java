package core;

public class employee {

	public static void main(String[] args) {
String name ="Kumar";
String name0 = "Kumar";
String name1 = new String("Kumar");
String name2 = new String("Kumar");
String name3 = name1.intern();

System.out.println("\t String literal comparsion:");
System.out.println(name==name0);
System.out.println(System.identityHashCode(name)+"=="+System.identityHashCode(name0));

System.out.println("\t String object comparsion:");
System.out.println(name1==name2);
System.out.println(System.identityHashCode(name1)+"!="+System.identityHashCode(name2));

System.out.println("\t Convert String object to literal:");
System.out.println(name==name3);
System.out.println(System.identityHashCode(name)+"=="+System.identityHashCode(name3));
	}

}