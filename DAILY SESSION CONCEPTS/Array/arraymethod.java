package Array;
import java.util.Arrays;
public class arraymethod {

	public static void main(String[] args) {
//sort an array:
		int[] arr = {5 ,8 ,6 ,4 ,5};
		
		System.out.println(":BEFORE SORTING:"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(":AFTER SORTING:"+Arrays.toString(arr));
		int index=Arrays.binarySearch(arr, 6);
		System.out.println("binary search:"+index);

		int[] original = {5,8,7,6,2,1,4};
		
		System.out.println("\n original element:"+Arrays.toString(original));
		
		int[] copy = Arrays.copyOf(original, original.length);
		
		System.out.println("\n Copying entire original element:"+Arrays.toString(copy));
		
		int[] copyrange = Arrays.copyOfRange(original, 1, 5);
		
		System.out.println("\n Copying based on range:"+Arrays.toString(copyrange));
	}

}