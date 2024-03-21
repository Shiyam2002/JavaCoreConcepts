package Array.Sorting;

import java.util.Arrays;

public class Bubble_sort {
	
	public static void main(String[] args) {
		int[] arr = {7,3,9,5,6,1};
		Bubble_sort bs = new Bubble_sort();
		bs.bubblesort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private int[] bubblesort(int[] arr) {
		int size = arr.length-1;
		
		for(int i=0; i<size ; i++) {
			for(int j=0;j<size-i;j++) {
				if(arr[j]>arr[j+1]) {			
					arr[j] = arr[j] + arr[j+1];			// swap using without temp variable
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
				}
			}
		}
		
		return arr;
	}
}


/* 
  In Bubble Sort algorithm, 

	~traverse from left and compare adjacent elements and the higher one is placed at right side. 
	~In this way, the largest element is moved to the rightmost end at first. 
	~This process is then continued to find the second largest and place it and so on until 
	 the data is sorted.
	 
  Advantages of Bubble Sort:
  
	~Bubble sort is easy to understand and implement.
	~It does not require any additional memory space.
	~It is a stable sorting algorithm, meaning that elements with the same key value 
	 maintain their relative order in the sorted output.


  Disadvantages of Bubble Sort:
  
	~Bubble sort has a time complexity of O(N2) which makes it very slow for large data sets.
	~Bubble sort is a comparison-based sorting algorithm, which means that it requires 
	 a comparison operator to determine the relative order of elements in the input data set. 
	 It can limit the efficiency of the algorithm in certain cases.
	 
  What is the Boundary Case for Bubble sort? 
  
	Bubble sort takes minimum time (Order of n) when elements are already sorted. 
	Hence it is best to check if the array is already sorted or not beforehand, 
	to avoid O(N2) time complexity.

 Does sorting happen in place in Bubble sort?
 
	Yes, Bubble sort performs the swapping of adjacent pairs without the use of 
	any major data structure. Hence Bubble sort algorithm is an in-place algorithm.

 Is the Bubble sort algorithm stable?
 
	Yes, the bubble sort algorithm is stable.

 Where is the Bubble sort algorithm used?
 
	Due to its simplicity, bubble sort is often used to introduce the concept 
	of a sorting algorithm. In computer graphics, it is popular for its capability to 
	detect a tiny error (like a swap of just two elements) in almost-sorted arrays and 
	fix it with just linear complexity (2n). 

Example: It is used in a polygon filling algorithm, where bounding lines are sorted by 
		 their x coordinate at a specific scan line (a line parallel to the x-axis), 
		 and with incrementing y their order changes (two elements are swapped) only 
		 at intersections of two lines.
	
*/
