package sortingAlgs;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

}
