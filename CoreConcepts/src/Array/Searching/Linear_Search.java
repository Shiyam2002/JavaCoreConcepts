package Array.Searching;

public class Linear_Search {
	
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,17,24,27};
		int target = 7;
		
		int result = linear(arr, target);
		if(result != -1)
			System.out.println("Element found at index : "+ result);
		else
			System.out.println("Element not found");
	}

	public static int linear(int[] arr, int target) {
		for(int i=0 ; i<arr.length;i++) {
			if(arr[i] == target)
				return i;
		}
		
		return -1;
	}

}
