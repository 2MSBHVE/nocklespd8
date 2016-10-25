package arrays;

public class AdvancedArrayMethods {

	
	
	public static void main(String[] args) {
		String[] array = {"a","b","c","d","e","f","g","h"};
		swap(array, 0,array.length -1);
		
		
	}

	private static void swap(String[] arr, int a, int b) {
		String placeholder = arr[b];
		arr[b] = arr[a];
		arr[a] = placeholder;
	}

	private static void methodA(int[] someArray) {
		int[] newArray = new int[someArray.length];
		
	}
	
	public static void copyArray(int[] original, 
			int[] target){
		if(original.length == target.length){
			for(int i = 0; i < original.length; i++){
				target[i] = original[i];
			}
		}else{
			//print an "error" message
			System.out.println("ERROR: tried to copy arrays"
					+ " of two different lengths.");
		}
	}


	public static int longestSequence(int[] array1, int[] array2) {
		int max = 0;
		int count = 0;
		
		for (int seqStart = 0; seqStart < array1.length; seqStart++) {
			int seqEnd = seqStart;
			int[] sequence = subArray(seqStart, seqEnd, array1);
			if(checkSequence(sequence, array2)){
				count++;
				if(count > max){
					max = count;
				}
			}
			
//			reset count after every sequence has been checked
			count = 0;
		}
		
		return max;
	}

//	returns true if sequence found in array2
	private static boolean checkSequence(int[] seq, int[] array) {
		int length = array.length;
		A: for (int i = 0; i < length; i++) {
			B: for (int j = 0; j < length; j++) {
				int[] subArr = subArray(i, j, array);
				if(subArr[j] != subArr[j-1] + 1){
//					breaks out of innermost for loop unless particular for loop is specified with a label
					break;
				}
				else if (j == subArr.length - 1){
					return true;
				}
			}
		}
		
		return false;
	}

	private static int[] subArray(int seqStart, int seqEnd, int[] array1) {
		int length = array1.length;
		int[] outArray = new int[length];
		
		if(seqEnd >= array1.length){
			System.out.println("doesnt contain that many nums");
			return null;
		}
		else{
			
			int selectionLength = (seqEnd + 1) - seqStart;
			
			for (int i = 0; i < selectionLength; i++) {
				outArray[i] = array1[seqStart + i];
			}
			
			return outArray;
		}
	}
	
	
}















