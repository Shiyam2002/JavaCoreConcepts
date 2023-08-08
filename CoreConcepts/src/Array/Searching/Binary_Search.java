package Array.Searching;

public class Binary_Search {
	
	public void binary(int arr[],int key) {
		int left=0;
		int right = arr.length-1;
		int mid = (left+right)/2;
		for(int i=0;i<arr.length;i++) {
			if(arr[mid] == key) {
				System.out.println("Value found at the index "+mid);
			}
			else if(arr[mid]>key) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = { 2,4,6,8,10,12};
		int key = 10;
		Binary_Search find = new Binary_Search();
		find.binary(arr,10);
	}

}
