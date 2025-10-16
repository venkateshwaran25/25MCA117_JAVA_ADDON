package Array;

import java.util.Arrays;

public class arraymethods {

	public static void main(String[] args) {
		int[] arr=new int[5];
		System.out.println("elements before allocating value:"+Arrays.toString(arr));
		Arrays.fill(arr, 1);
		System.out.println("array fill with single value:"+Arrays.toString(arr));
		Arrays.fill(arr, 1, 4, 2);
		System.out.println("\n arrays fill with range:"+Arrays.toString(arr));
	}

}
