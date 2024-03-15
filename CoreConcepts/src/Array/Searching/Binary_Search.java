package Array.Searching;

public class Binary_Search {
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9,11,13};
		int target =7;
		
		int result = binary(arr ,target);
		if(result != -1) {
			System.out.println("Element found at index : "+ result);
		}
		else
			System.out.println("Element not found");
	}

	private static int binary(int[] arr, int target) {
		int left = 0;
		int right = arr.length-1;
		int mid;
		
		for(int i=0;i<arr.length;i++) {
			mid = (left+right)/2;
			if(arr[mid] == target)
				return mid;
			else if(arr[mid] >target)
				right = mid-1;
			else
				left = mid+1;
		}
		return -1;
	}
}
