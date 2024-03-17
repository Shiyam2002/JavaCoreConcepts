package Array;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};
		//reverseArray(arr);
		//reverseArrayUsingTemp(arr);
		reverseArrayRecursion(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void reverseArrayRecursion(int[] arr, int start, int end) {
		int temp;
		if(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
	}

	private static void reverseArrayUsingTemp(int[] arr) {
		int temp, start,end;
		start =0;
		end = arr.length-1;
		while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
		
	}

	private static void reverseArray(int[] arr) {
		int[] ReverseArr = new int[arr.length];
		
		for(int i=arr.length-1; i>=0 ;i--) {
			ReverseArr[i] = arr[arr.length-i-1];
		}
		
		System.out.println(Arrays.toString(ReverseArr));	
	}
	
	

}
