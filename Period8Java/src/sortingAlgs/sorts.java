package sortingAlgs;

import java.util.Arrays;

public class sorts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		bubbleSort(populateRandInts(0, 50, 25));
		selectionSort(populateRandInts(0, 50, 25));
		
	}
	
	public static int[] insertionSort(int[] arrIn) {
		for (int i = 1; i < arrIn.length; i++) {
			
		}
		return arrIn;
	}
	
	private static int[] populateSeqInts(int startNum, int length){
		int[] array =  new int[length];
		
		for (int i = 0; i < length; i++) {
			array[i] = startNum + i;
		}
		
		return array;
		
	}
	
	private static int[] populateRandInts(int min, int max, int length){
		int[] array =  new int[length];
//		int[] results = new int[max-min];
		int rand;
		
		for (int i = 0; i < length; i++) {
			rand = min + (int)(Math.random()*(max-min));
			array[i] = rand;
//			results[rand - min]++;
			
		}
		
//		printArray(results);
//		System.out.println("-------------------------------");
//		System.out.println("-------------------------------");
//		System.out.println("-------------------------------");
//		System.out.println("-------------------------------");
//		System.out.println("-------------------------------");
//		System.out.println("-------------------------------");
//		System.out.println("-------------------------------");
//		
		
		return array;
		
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	
	
	public static void selectionSort(int[] array){
		System.out.println("Selection sort with "+Arrays.toString(array));
		for (int i = 0; i < array.length - 1; i++){
			int tempLowIndex = i;
			for (int j = i + 1; j < array.length; j++){
				if (array[j] < array[tempLowIndex]){
					tempLowIndex = j;
				}
			}
			if(tempLowIndex!=i){
				swap(array, tempLowIndex, i);
				System.out.println("becomes "+Arrays.toString(array));
			} 
		}//end for
		System.out.println("Ends as "+Arrays.toString(array));
	}//end method
	
	public static void bubbleSort(int[] array){
		System.out.println("Bubble sort with "+Arrays.toString(array));
		for(int i=0; i < array.length-1; i++){
			for(int j=1; j < array.length-i; j++){
				if(array[j-1] > array[j]){
					swap(array,j-1,j);
					System.out.println("becomes "+Arrays.toString(array));
				}
			}
			System.out.println("Ends as "+Arrays.toString(array));
		}
	}

}
