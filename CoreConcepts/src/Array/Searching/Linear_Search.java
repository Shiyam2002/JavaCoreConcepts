package Array.Searching;

public class Linear_Search {
	
	public void linear(int[] arr,int key) {
		boolean flag =false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				System.out.println("Value found at "+i+" index");
				flag = true;
			}
		}
		
		if(flag == false) {
			System.out.println("Value not found or value doesn't exist");
		}
	}

	public static void main(String[] args) {
		

	}

}
