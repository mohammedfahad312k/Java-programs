package com.sortingPrograms;

public class BubbleSort {
	
	/*public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,1,2,1,2,1,2, 5, 1, 8, 6, 1};
		bubbleSort(arr);
		for(int i:arr) {
			System.out.print(i + " ");
		}

	}

}*/
	
	public static void main(String[]args) {
		
		int arr[]= {7,77,88,99,2,4,1,6,8,9};
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]= temp;
				}
			}
		}
		for(int i:arr) {
			System.out.print(i + " ");
		}
	}
}

