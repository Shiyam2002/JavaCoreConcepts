package Array;

import java.util.Arrays;

public class MaxNMinElement {
	public static void main(String[] args) {
		int[] arr = {34,65,2,1,87,23,77};
		//FindMaxNMin(arr);
		//FindMaxNMinSort(arr);
		//FindMaxNMinTournament();
	}

	public static void FindMaxNMinSort(int[] arr) {
		Arrays.sort(arr);
		int max = arr[0];
		int min = arr[arr.length-1];
		System.out.println("Max : "+max+" Min : "+min);	
		
	}

	public static void FindMaxNMin(int[] arr) {
		int max=arr[0],min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i])
				max = arr[i];
		}
		
		for(int j=1;j<arr.length;j++) {
			if(min>arr[j])
				min = arr[j];
		}
		
		System.out.println("Max : "+max+" Min : "+min);
	}
}
