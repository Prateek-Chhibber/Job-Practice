package com.array;

public class BinaryRecursion {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 10, 40 };
		int x = 10;
		int start = 0;
		int end = arr.length - 1;
		System.out.println("end = " + end);
		int result = binaryRecursive(arr,start,end,x);
		if(result == -1) {
			System.out.println("Element not present");
		}else {
			System.out.println("Element found at : "+result);
		}
	}

	public static int binaryRecursive(int arr[],int start, int end, int find) {
		int mid = 0;
		if(start<=end) {
			mid = (start + end)/2;
			System.out.println("mid = " + mid);
			if(arr[mid] == find) {
				return mid;
			}
			//			Check if element is greater than middle then ignore left half
			else if(find>arr[mid]) {
				binaryRecursive(arr, mid+1, end, find);
				return binaryRecursive(arr, mid+1, end, find);
			}
			//			Check if element is greater than middle then ignore right half
			else {
				binaryRecursive(arr, start, mid-1, find);
			}
		}
		return -1;
	}

}
