package arrays;

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


//		int[] forSortedInts = new int[199999999];
//		for (int i = forSortedInts.length - 1; i >= 0; i--) {
//			forSortedInts[(forSortedInts.length - 1) - i] = i;
//		}
//
//		long startedTime;
//		long endedTime;
//		int x;
//		for (int i = 0; i < 100; i++) {
//			int newInt = (int) ((200999999)*Math.random()) + 5;
////			int newInt = (int) ((5)*Math.random()) + 200999999;
//			
//			if((double)(i)/2 == i/2) {
//				startedTime = System.currentTimeMillis();
//				x = searchSorted(forSortedInts, newInt);
//				endedTime = System.currentTimeMillis();
//			}
//			else{
//				startedTime = System.currentTimeMillis();
//				x = searchUnsorted(forSortedInts, newInt);
//				endedTime = System.currentTimeMillis();
//			}
//			
//			System.out.print((double)(i)/2 == i/2);
//			if((double)(i)/2 == i/2) {
//				System.out.print(" ");
//			}
//			System.out.print("     ");
//			System.out.print(newInt);
//			System.out.print("     ");
//			System.out.print(x);
//			System.out.print("     ");
//			System.out.println("completed in " + (endedTime - startedTime));
//		}

//		for (int i = 0; i < forSortedInts.length; i++) {
////						System.out.println(forSortedInts[i]);
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

//	printArrayLinear(generateDistinctItemsList(30));
	double[] arr = {8.0, 3.0, 20.0, 27.0, 18.0, 35.0, 19.0, 13.0, 38.0, 11.0, 10.0, 47.0, 1.0, 39.0, 52.0, 41.0, 28.0, 59.0, 37.0, 9.0, 48.0, 43.0, 33.0, 46.0, 22.0, 24.0, 36.0, 32.0, 23.0, 45.0};
	printArrayLinear(getStats(arr));
		
//		printArrayLinear(sortArrayAsc(arr));
//	
//	double[] doubles = {3,7,4,2,8,6,2,9};
//	
//	printArrayLinear(getStats(doubles));
//	
//	int[] toCycle = {3,7,4,2,8,6,2,9};
////	printArrayLinear(toCycle);
//	System.out.println("-");
//	cycleThrough(toCycle, 0) ;
//	
////	printArrayLinear(toCycle);
//	
//	int[] arr1 = {4,4,4,4};
//	int[] arr2 = {1,2,3,4}; 
//	System.out.println(countDifferences(arr1, arr2));

//		int[] forSortedInts = {1000, 997, 992, 991, 990, 984, 980, 975, 969, 965, 962, 956, 955, 954, 951, 950, 945, 944, 941, 939, 936, 930, 929, 926, 921, 920, 914, 911, 907, 906, 904, 901, 900, 899, 893, 889, 883, 877, 873, 871, 868, 864, 858, 854, 852, 847, 842, 840, 836, 830, 825, 821, 817, 816, 815, 810, 809, 808, 805, 802, 801, 799, 793, 788, 783, 779, 773, 769, 764, 760, 755, 752, 750, 747, 742, 740, 739, 735, 734, 728, 724, 721, 716, 713, 710, 707, 701, 698, 693, 690, 688, 682, 680, 677, 675, 674, 673, 669, 664, 661, 660, 657, 653, 652, 647, 646, 642, 638, 635, 632, 630, 627, 622, 618, 613, 607, 601, 597, 596, 595, 591, 586, 582, 578, 572, 569, 567, 566, 564, 561, 556, 550, 546, 545, 541, 539, 533, 532, 528, 525, 520, 516, 511, 507, 506, 503, 500, 499, 495, 491, 489, 483, 480, 476, 475, 469, 463, 459, 457, 455, 454, 448, 445, 439, 433, 432, 427, 422, 420, 419, 413, 410, 409, 403, 401, 398, 394, 391, 386, 382, 379, 376, 374, 369, 365, 359, 356, 354, 348, 346, 341, 339, 337, 335, 334, 330, 326, 322, 318, 317, 315, 314, 312, 309, 304, 303, 299, 297, 295, 289, 286, 281, 275, 269, 267, 266, 261, 256, 255, 253, 252, 246, 245, 240, 238, 236, 234, 232, 231, 228, 222, 218, 214, 210, 207, 204, 202, 199, 198, 197, 196, 194, 190, 186, 182, 177, 171, 167, 161, 156, 150, 144, 139, 135, 132, 127, 123, 117, 113, 107, 106, 104, 100, 95, 94, 88, 84, 81, 75, 73, 68, 63, 62, 59, 54, 53, 48, 45, 44, 43, 37, 36, 35, 30, 24, 22, 20, 17, 12, 6, 3, 2};

//		reverseOrder(temparr);
		
//		long startTime0 = System.currentTimeMillis();
//		long endTime0 = System.currentTimeMillis();

		
		
//		printArrayLinear(forSortedInts);		
		
		


	}
	
	private static void printArrayLinear(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i != (array.length - 1)){
				System.out.print(", ");
			}
		}
		System.out.print("\n");
		
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

		int left = 0;
		int right = array.length - 1;
		
//		if ((key > array[0]) || (array[array.length - 1] > key)) {
//			return -1;
//		}
		
		while (left <= right) {
			
			int mid = (left + right)/2;
			int midVal = array[mid];
			
			if (midVal < key) {
				right = mid - 1;
			}
			else if (midVal > key) {
				left = mid + 1;
			}
			else {
				return mid;
			}
			
		}
		
		return -1;
		
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
		
		for (int i = 0; i < array.length; i++) {
			stats[0] = stats[0] + array[i];
		}
		stats[0] = (stats[0] / array.length);
		
		stats[1] = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i] > stats[1]){
				stats[1] = array[i];
			}
		}
		
		stats[2] = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i] < stats[2]){
				stats[2] = array[i];
			}
		}
		
		stats[4] = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] >= stats[0]) {
				stats[4]++;
			}
		}
		
		stats[5] = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] < stats[0]) {
				stats[5]++;
			}
		}
		
		
		//SORT LIST FOR MEDIAN
		
//		double[] arrayCopy = new double[array.length];
		
		
		
		double[] sorted = sortArrayAsc(array);
		
		
//		printArrayLinear(sorted);
		
		double tempLengthVar = (double)(sorted.length);
		System.out.println(tempLengthVar);
		System.out.println(sorted.length);
		System.out.println((tempLengthVar / 2) == (sorted.length / 2));
		
		if ((tempLengthVar / 2) == (sorted.length / 2)){
			stats[3] = (sorted[(sorted.length / 2) - 1] + sorted[(sorted.length / 2)]) / 2;
		}
		
		
		
		
		
		
		
		
		return stats;
	}
	
	public static double[] sortArrayAsc(double[] array) {
		int length = array.length;
		double[] arrayIn = new double[length];
		
		for (int i = 0; i < length; i++) {
			arrayIn[i] = array[i];
		}
		
		double[] sorted = new double[length];
		
		double max = array[0];
		for (int i = 1; i < length; i++) {
			if(array[i] > max){
				max = array[i];
			}
		}
//		System.out.println("Max " + max);
		
		for (int i = 0; i < length; i++) {
			double min = arrayIn[0];
			int pos = 0;
			for (int j = 0; j < length; j++) {
				if(arrayIn[j] < min){
					min = arrayIn[j];
					pos = j;
				}
			}
			sorted[i] = min;
			arrayIn[pos] = max;
//			printArrayLinear(sorted);
//			printArrayLinear(arrayIn);
		}
		
		return sorted;
		
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

		int length = array.length;
		int[] arrayIn = new int[length];
		
		for (int i = 0; i < length; i++){
		    arrayIn[i] = array[i];
		}
		
		int[] arrayOut = new int[length];

		for (int i = 0; i < length; i++) {
			array[i] = arrayIn[(length - 1) - i];
		}
		
// 		array = arrayOut;
		
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
		
		if(array1.length == array2.length){
				
			int length = array1.length;
			int num = 0;
			
			for (int i = 0; i < length; i++) {
				if(array1[i] != array2[i]) {
					num++;
				}
			}
			
			return num;
		}
		else{
			System.out.println("Arrays are not the same length.");
			return 0;
		}
		
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
//				printArrayLinear(outArray);
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
		
		
		if (n > 0) {
//			int[] newArray = new int[array.length];
			for (int i = 0; i < n; i++) {
				int temp = array[array.length - 1];
				array[array.length - 1] = array[0];
//				newArray = array;
				for (int j = 0; j < array.length - 2; j++) {
					array[j] = array[j + 1];
//					printArrayLinear(array);
				}
				array[array.length - 2] = temp;
			}
//			array = newArray;
		}
		else if (n < 0) {
//			int[] newArray = new int[array.length];
			for (int i = -1; i > n; i--) {
				int temp = array[0];
				array [0] = array[array.length - 1];
//				newArray = array;
				for (int j = array.length - 1; j > 0; j--) {
					array[j] = array[j - 1];
//					printArrayLinear(array);
				}
				array[1] = temp;
			}
		}
		
	}


}
