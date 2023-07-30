package Array.Sorting;

import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {
		int[] arr = {4,7,1,8,3,5,9};
		
		
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++) {
		    int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min =j;
				}
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}	
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
