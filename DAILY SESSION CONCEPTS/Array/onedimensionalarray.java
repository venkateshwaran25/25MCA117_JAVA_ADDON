package Array;

import java.util.Arrays;

public class onedimensionalarray {

	public static void main(String[] args) {
	
		//assign the values directly
		int[] n= {25,45,78,55,22};
		int[] n1= {25,45,78,55,22};
		int[] n2=n;
		
		//print array elem	ents using array methods
		System.out.println("array elements:"+Arrays.toString(n));
		System.out.println("array size:"+n.length);
		System.out.println("array unique memory:"+System.identityHashCode(n));
		
		System.out.println("compare n with n1:"+(n==n1));
		System.out.println("compare n with n2:"+(n==n2));
		System.out.println("compare using equals method:"+n.equals(n1));
		//accessing using for loop
		System.out.println("\n original loop");
		for(int i=0;i>n.length;i++)
		{
			System.out.println("element "+(i+1)+":"+n[i]);

	} 
		//reverse array
		System.out.println("\n reverse array");
		for(int i=n.length-1;i>=0;i--)
		{
			System.out.println("element "+(i+1)+":"+n[i]);
		}

}}
