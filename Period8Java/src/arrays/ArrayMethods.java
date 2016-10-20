package arrays;

import java.util.stream.IntStream;

public class ArrayMethods {

	public static void main(String[] args) {

		/**
		 * IMPORTANT NOTE: 
		 * This homework assignment will be weighted 4x.
		 * DO NOT ASSUME my tests are perfect! If you have code that you think should work, 
		 * but you keep failing the tests PLEASE bring it to my attention so that I can fix the tests
		 * DO NOT spend hours and hours trying to fix perfect code just because my test
		 * says that it isn't perfect!
		 * */


		//    	int[] ints = {4,3,34,1};
		//    	System.out.println(isSorted(ints));


//		int[] forSortedInts = new int[12000000];
//		for (int i = forSortedInts.length - 1; i >= 0; i--) {
//			forSortedInts[(forSortedInts.length - 1) - i] = i;
//		}
//
//		for (int i = 0; i < forSortedInts.length; i++) {
//			//			System.out.println(forSortedInts[i]);
//		}


//		int[] sortedInts = {100, 99, 98, 97, 96, 95, 94, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

//		int a;

		//    	long startTime0 = System.currentTimeMillis();
		//    	
		//    	for (int i = 1; i <= 1000; i++) {
		////			System.out.println((String)(i + " " + searchUnsorted(forSortedInts, i)));
		//    		a= searchUnsorted(forSortedInts, i);
		//    	}
		//    	
		//    	long endTime0 = System.currentTimeMillis();
		//    	
		//    	System.out.println("Completed unsorted method in " + (endTime0 - startTime0) + " milliseconds");

		//    	reverseOrder(forSortedInts);

//		long startTime;
//		long endTime;
//		for(int t = 0; t < 1000; t++){
//			startTime = System.currentTimeMillis();
//			for (int i = 1; i <= 12000000; i++) {
//				//			System.out.println((String)(i + " " + searchSorted(forSortedInts, i)));
//				a = searchSorted(forSortedInts, i);
//			}
//			endTime = System.currentTimeMillis();
//			System.out.println(t + ": Completed sorted method in " + (endTime - startTime) + " milliseconds");
//		
//		}

	printArrayLinear(generateDistinctItemsList(30));





	}
	
	public static void printArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void printArrayLinear(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i != (array.length - 1)){
				System.out.print(", ");
			}
		}
		System.out.print("\n");
	}
	

	public static int searchUnsorted(int[] arrayToSearch, int key){
		/**
		 * this method take an unsorted int array (arrayToSearch) and returns an 
		 * int corresponding to the index of a key, if it is in the array
		 * if the key is not in the array, this method returns -1
		 * */

		for (int i = 0; i < arrayToSearch.length; i++) {
			if (arrayToSearch[i] == key) {
				return i;
			}
		}

		return -1;
	}

	public static int searchSorted(int[] array, int key){
		/**
		 * this method is exactly like the one above, except the parameter sortedArrayToSearch will
		 * always be sorted in DESCENDING order. Again return the index of the key or return -1
		 * if the key is not in the array
		 * 
		 * Note: You should attempt to write a method that is more efficient that searchUnsorted
		 * */

		//    	Super giant arrays is where this really shines. Try it, Mr. Nockles!

		key = -1 * key;

		int low = 0;
		int high = array.length - 1;

		while (low >= high) {
			int mid = (-1)*(low + high) >>> 1;
		long midVal = -1 * array[mid];

		if (midVal < key)
			low = -1* (mid + 1);
		else if (midVal > key)
			high = -1 * (mid - 1);
		else
			return Math.abs(array.length - mid); // key found
		}
		return -1;  // key not found.

	}

	public static boolean isSorted(int[] array){
		/**
		 * This method takes an in array as a parameter and returns 'true' if the array is already sorted in DESCENDING order
		 * */

		for (int i = 0; i < (array.length - 1); i++) {
			if(array[i] < array [i+1]){
				return false;
			}
		}

		return true;
	}


	public static double[] getStats(double[] array){
		/** 
		 * This method return a double[] contain a WHOLE BUNCH of stats
		 * The double array must keep the following stats about the array parameter:
		 * index 0 = the mean
		 * index 1 = the max
		 * index 2 = the min
		 * index 3 = the median
		 * index 4 = the number of values greater than or equal to the mean
		 * index 5 = the number of values below the mean
		 * */
		double[] stats = new double[6];
		return stats;
	}

	public static void reverseOrder(int[] array){
		/**
		 * this method reverses the order of the array passed to it.
		 * Not that this method does not have a return type. You do not need to copy the array first
		 * Furthermore, note that the array is not necessarily in any *particular* order. It may be 
		 * in a random order, though you still need to reverse whatever order it is in
		 * 
		 * Example:
		 * array = {5, 1, 9, 10, 16, -6}
		 * after calling this method
		 * array = {-6, 16, 10, 9, 1, 5}
		 * 
		 * */

		int[] arrayIn = array;

		for (int i = 0; i < array.length; i++) {
			array[(array.length - 1) - i] = arrayIn[i];
		}
	}

	public static int countDifferences(int[] array1, int[] array2){
		/**Here, you will write an method that returns the number of values in two arrays 
		 * that are NOT the same (either in value OR location).
		 * The arrays ALWAYS have the same length
		 * Examples:
		 * countDifferences({1,2,3},{1,2,3}) returns 0, since these arrays are exactly the same
		 * countDifferences({3,2,3,4},{3,2,5,4}) returns 1, since '3','2', and '4' are same value, same location, but the 3 and 5 are different
		 * countDifferences({4,4,4,4},{1,2,3,4}) returns 3, since '4' is only at the same index ONE time and three others are not
		 * countDifferences({1,2,3},{1,3,2}) returns 2, since '2' and '3' are both present, but different locations
		 * 
		 * */
		return 0;
	}


	public static int longestConsecutiveSequence(int[] array1){
		/**This method counts the longest consequtive sequence in an array.
		 * It does not matter where the sequence begins
		 * If there are no consecutive numbers, the method should return '1'
		 * 
		 * Examples:
		 * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
		 * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
		 * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
		 * */

		return 0;
	}

	public static int longestSharedSequence(int[] array1, int[] array2){
		/**This method counts the longest unbroken, shared sequence in TWO arrays.
		 * The sequence does NOT have to be a consecutive sequence
		 * It does NOT matter where the sequence begins, the arrays might not be the same length
		 * 
		 * Examples:
		 * longestSequence({9,6,3,4,3,8,9}, {9,6,3,4,3,6,7}) returns '5', since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long 
		 * longestSequence({0,9,6,3,4,3,8,9}, {1,2,9,6,3,4,3,6,7}) returns '5', 
		 *          since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long, it doesn't matter that the sequence begins at different indices 
		 * longestSequence({9,6,1,4,3,6,7,9}, {9,6,5,8,3,6,7,0}) returns '3', since the sequence '3,6,7' is in both arrays and is 3 integers long
		 * */

		return 0;
	}

	public static int[] generateDistinctItemsList(int n){
		/**
		 * This method needs to generate an int[] of length n that contains distinct, random integers
		 * between 1 and 2n 
		 * The method will be tested by verifying that the array you return is n items long,
		 * contains only entries between 1 and 2n (inclusive) and has no duplicates
		 * 
		 * */
		int[] outArray = new int[n];
		for (int i = 0; i < outArray.length; i++) {
			
			int newInt = -1;
			boolean contains = true;
			while(contains == true){
				printArrayLinear(outArray);
				newInt = (int) ((2*n)*Math.random()) + 1;
				if(searchUnsorted(outArray, newInt) < 0){
					outArray[i] = newInt;
					contains = false;
				}
			}
		}
		return outArray;
		
	}


	public static void cycleThrough(int[] array, int n){
		/** This problem represents people moving through a line.
		 * Once they get to the front of the line, they get what they've been waiting for, then they 
		 * immediately go to the end of the line and "cycle through" again.
		 * 
		 * This method reorders the array so that it represents what the array would look like
		 * after it had been cycled through an n number of times.
		 * For example, cycleThrough({2,1,5,6}}, 1) after executing, array == {1,5,6,2} 
		 * because '2' (the person at the front of the line) cycled through and is now at the end of the line
		 * 
		 * cycleThrough({3,7,4,2,8,6,2,9}}, 2) after executing, array == {4,2,8,6,2,9,3,7} 
		 * because '3' and '7' (the TWO people at the front of the line) cycled through and are now at the end of the line
		 * 
		 * Likewise,
		 * cycleThrough({3,7,4,2,8,6,2,9}}, 0) after executing, array == {3,7,4,2,8,6,2,9}  (no movement)
		 * and the most interesting case, 
		 * cycleThrough({3,7,4,2,8,6,2,9}}, 49) after executing, array == {7,4,2,8,6,2,9,3}  
		 * Because after cycling through 49 times, everyone had a chance to go through 6 times, but '3'
		 * was able to go through one more time than anyone else
		 * 
		 * CHALLENGE
		 * For extra credit, make your method handle NEGATIVE n
		 * */
	}


}
