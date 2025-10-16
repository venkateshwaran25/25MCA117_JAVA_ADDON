package core;

public class stringmethods {

	public static void main(String[] args) {
		String s="Hello java  ";
		
		
		/*System.out.println("String str: "+s);
        System.out.println("length:"+s.length());
        System.out.println("uppercase:"+s.toUpperCase());
        System.out.println("trim:"+s.trim());
        System.out.println("substring:"+s.substring(2,6));
        System.out.println("replace:"+s.replace("java", "world"));
        System.out.println("equals:"+s.trim().equals("Hello java"));
        System.out.println("char:"+s.charAt(6));
        */
		
		
		StringBuffer  sb =new StringBuffer("java");
//		System.out.println(sb);
		sb.append("  programming");
		sb.insert(17, " language");
		sb.replace(0, 5, "python");	
//		sb.delete(0,5);
		System.out.println(sb);
		
        
       
	}

}
