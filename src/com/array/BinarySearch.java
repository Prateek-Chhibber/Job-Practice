package com.array;

public class BinarySearch {
	
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int x = 10;
		int result = binarySearch(arr,x);
		if(result == -1) {
			System.out.println("Element not present");
		}else {
			System.out.println("Element found at : "+result);
		}
	}
	
	public static int binarySearch(int arr[], int x) {
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = (start+end)/2;
//			System.out.println("mid = "+mid+" Value of mid "+arr[mid]);
			// Check if middle element is equal to our search element x.
			if(arr[mid] == x) {
				return mid;
			}
//			If x greater, ignore left half of the array
			else if(x>arr[mid]) {
				start = mid + 1;
//				System.out.println("start = "+start);
			}
//			If x is smaller, ignore right half of the array
			else {
				end = mid - 1;
//				System.out.println("end = "+end);
			}
		}
		return -1;
		
	}

}
