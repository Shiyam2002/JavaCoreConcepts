package Array.Sorting;

import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {
		int[] arr = {4,7,1,8,3,5,9};
		int min_ele ;
		
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			min_ele = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(min_ele > arr[j]) {
					int temp = min_ele;
					min_ele = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
