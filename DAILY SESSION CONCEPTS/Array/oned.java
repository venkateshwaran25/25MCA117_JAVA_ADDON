package Array;

import java.util.Scanner;

public class oned {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of 1D array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for( int i =0; i<size; i++) {
			System.out.print("Element" +(i+1)+": ");
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("\n Enter the elemnts for 1 D Array :");
		for ( int i =0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		
		sc.close();

	}
	

}