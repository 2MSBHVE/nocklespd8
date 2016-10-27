/**
 * Max Friedman
 * Nockles AP Java Pd. 8 2016-2017
 * Array Methods Homework
 * */

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
//	double[] arr = {8.0, 3.0, 20.0, 27.0, 18.0, 35.0, 19.0, 13.0, 38.0, 11.0, 10.0, 47.0, 1.0, 39.0, 52.0, 41.0, 28.0, 59.0, 37.0, 9.0, 48.0, 43.0, 33.0, 46.0, 22.0, 24.0, 36.0, 32.0, 23.0, 45.0};
//	printArrayLinear(getStats(arr));
		
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
		
//		seqarr2 is 1 shorter than seqarr1
		
		int[] seqarr1 = {1000, 998, 993, 988, 984, 980,282,281, 280, 977, 972, 969, 966, 964, 958, 956, 952, 951, 945, 941, 938, 937, 936, 935, 932, 931, 926, 925, 922, 919, 917, 911, 907, 905, 900, 894, 893, 889, 887, 885, 879, 878, 876, 871, 866, 863, 858, 854, 850, 846, 842, 837, 835, 834, 832, 828, 827, 821, 816, 814, 812, 809, 806, 805, 804, 799, 795, 789, 787, 781, 778, 772, 768, 765, 764, 760, 758, 754, 752, 750, 749, 743, 741, 739, 738, 737, 735, 734, 730, 726, 725, 724, 718, 716, 711, 706, 704, 700, 696, 692, 690, 684, 680, 678, 676, 672, 667, 661, 656, 651, 645, 643, 638, 637, 636, 635, 634, 631, 630, 624, 621, 617, 616, 615, 614, 609, 603, 597, 596, 594, 589, 584, 582, 576, 570, 568, 565, 560, 557, 551, 548, 544, 542, 541, 535, 530, 526, 520, 515, 512, 506, 503, 502, 499, 498, 494, 490, 487, 483, 481, 475, 473, 468, 463, 460, 458, 453, 448, 444, 439, 437, 435, 432, 430, 427, 421, 418, 417, 414, 408, 405, 400, 398, 396, 393, 391, 388, 383, 377, 373, 372, 371, 367, 361, 357, 355, 350, 344, 341, 337, 335, 330, 328, 327, 326, 321, 317, 312, 310, 304, 303, 298, 296, 291, 290, 285, 280, 275, 273, 269, 266, 264, 262, 260, 255, 251, 249, 246, 245, 241, 238, 235, 233, 228, 227, 225, 219, 213, 208, 203, 201, 196, 195, 189, 183, 178, 176, 171, 166, 160, 155, 149, 147, 145, 142, 140, 135, 134, 128, 126, 124, 122, 116, 112, 109, 107, 103, 100, 96, 90, 88, 83, 79, 76, 74, 73, 72, 71, 68, 67, 64, 63, 57, 52, 47, 44, 41, 40, 37, 32, 27, 26, 22, 18, 13, 7, 5, 2, -2, -7, -8, -10, -12};
		int[] seqarr2 = {300, 299, 293, 289, 288, 282,281, 280, 277, 272, 266, 264, 260, 258, 253, 249, 245, 239, 237, 234, 232, 226, 220, 218, 216, 213, 209, 203, 198, 194, 193, 187, 186, 181, 180, 179, 177, 171, 168, 167, 165, 159, 155, 150, 146, 140, 136, 135, 130, 127, 124, 119, 118, 113, 111, 107, 101, 96, 92, 91, 88, 87, 86, 81, 80, 78, 73, 70, 69, 66, 63, 60, 54, 53, 47, 43, 40, 36, 30, 27, 25, 22, 17, 16, 15, 11, 7, 4, 2, 0, -1, -6, -11, -17, -21, -26, -28, -33, -37, -39, -41, -43, -48, -49, -51, -53, -59, -62, -65, -67, -70, -73, -75, -79, -80, -86, -91, -97, -100, -106, -112, -115, -117, -122, -127, -128, -133, -136, -138, -141, -142, -146, -147, -150, -151, -157, -163, -169, -172, -176, -181, -187, -190, -194, -195, -197, -198, -201, -204, -209, -215, -219, -221, -224, -229, -234, -239, -241, -242, -247, -253, -259, -260, -264, -267, -268, -270, -275, -281, -282, -287, -293, -297, -299, -301, -305, -307, -310, -314, -316, -320, -325, -328, -333, -338, -340, -342, -343, -348, -354, -355, -361, -363, -369, -372, -375, -376, -377, -378, -384, -387, -392, -396, -398, -399, -402, -405, -406, -411, -415, -420, -426, -428, -431, -437, -442, -448, -452, -456, -460, 301, -468, -471, -472, -478, -484, -486, -492, -498, -500, -502, -506, -507, -511, -515, -516, -517, -518, -520, -526, -529, -535, -540, -545, -550, -556, -557, -558, -562, -564, -569, -573, -576, -580, -584, -588, -589, -592, -595, -599, -603, -607, -611, -617, -618, -622, -625, -629, -631, -632, -638, -642, -645, -650, -651, -657, -658, -664, -669, -670, -674, -675, -678, -680, -681, -682, -686, -691, -695, -699, -700, -703, -705, -708, -712, -714, -720, -721, -727, -729, -733};

		
		System.out.println(longestSharedSequence(seqarr1, seqarr2));
		
		int[] test1 = {998, 993, 988};
		int[] test2 = {998, 993, 988};
		
//		System.out.println(test1==test2);
//		System.out.println(compareArrays(test1, test2));
		
//		System.out.println(longestConsecutiveSequence(seqarr1));
		
		int[] arrayforsubbing = {1000, 998, 993, 988, 984, 980, 977, 972, 969, 966, 964, 958, 956, 952, 951, 1,2,3,4,5,6,7,8, 945, 941, 938, 937, 936, 935, 932, 931, 926, 925, 922, 919, 917, 911, 907, 905, 900, 894, 893, 889, 887, 885, 879, 878, 876, 871, 866, 863, 858, 854, 850, 846, 842, 837, 835, 834, 832, 828, 827, 821, 816, 814, 812, 809, 806, 805, 804, 799, 795, 789, 787, 781, 778, 772, 768, 765, 764, 760, 758, 754, 752, 750, 749, 743, 741, 739, 738, 737, 735, 734, 730, 726, 725, 724, 718, 716, 711, 706, 704, 700, 696, 692, 690, 684, 680, 678, 676, 672, 667, 661, 656, 651, 645, 643, 638, 637, 636, 635, 634, 631, 630, 624, 621, 617, 616, 615, 614, 609, 603, 597, 596, 594, 589, 584, 582, 576, 570, 568, 565, 560, 557, 551, 548, 544, 542, 541, 535, 530, 526, 520, 515, 512, 506, 503, 502, 499, 498, 494, 490, 487, 483, 481, 475, 473, 468, 463, 460, 458, 453, 448, 444, 439, 437, 435, 432, 430, 427, 421, 418, 417, 414, 408, 405, 400, 398, 396, 393, 391, 388, 383, 377, 373, 372, 371, 367, 361, 357, 355, 350, 344, 341, 337, 335, 330, 328, 327, 326, 321, 317, 312, 310, 304, 303, 298, 296, 291, 290, 285, 280, 275, 273, 269, 266, 264, 262, 260, 255, 251, 249, 246, 245, 241, 238, 235, 233, 228, 227, 225, 219, 213, 208, 203, 201, 196, 195, 189, 183, 178, 176, 171, 166, 160, 155, 149, 147, 145, 142, 140, 135, 134, 128, 126, 124, 122, 116, 112, 109, 107, 103, 100, 96, 90, 88, 83, 79, 76, 74, 73, 72, 71, 68, 67, 64, 63, 57, 52, 47, 44, 41, 40, 37, 32, 27, 26, 22, 18, 13, 7, 5, 2, -2, -7, -8, -10, -12};
//		System.out.println(longestConsecutiveSequence(arrayforsubbing));
		
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
		
		for (int i = 0; i < length; i++) {
			array[i] = arrayIn[(length - 1) - i];
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

		int length = array1.length;
		
		int max = 1;
		int count = 1;
		
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				int[] currentArr = createSubarray(array1, i, j);
//				printArrayLinear(currentArr);
				count = 1;
				for (int k = 1; k < currentArr.length; k++) {
					if (currentArr[k] == (currentArr[k-1] + 1)) {
						count++;
						if (count > max) {
							max = count;
						}
//						System.out.println("count " + count + ", max " + max);
					}
					else {
						count = 0;
						break;
					}
				}
			}
		}
		return max;
	}

	private static int[] createSubarray(int[] array1, int a, int b) {
		int outLength = (b - a) + 1;
		int[] arrayOut = new int[outLength];
		if (a == b) {
			arrayOut[0] = array1[a];
		}
		else {
			for (int i = 0; i < outLength; i++) {
				arrayOut[i] = array1[a + i];
			}
		}
		return arrayOut;
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
		
		int length1 = array1.length;
		int length2 = array2.length;
		
		int maxSeqLength = 0;
		
		if (length1 <= length2) {
			maxSeqLength = length1;
		}
		else {
			maxSeqLength = length2;
		}
		
		int max = 0;
		
		for (int i = 0; i < length1; i++) {
			for (int j = i; j < length1; j++) {
				int[] newSeq = createSubarray(array1, i, j);
				int seqLength = (j - i) + 1;
				
//				printArrayLinear(newSeq);
					
				for (int c = 0; c < length2; c++) {
					for (int d = c; d < length2; d++) {
						if((d - c) + 1 == seqLength){
							int[] newSeq2 = createSubarray(array2, c, d);
//							printArrayLinear(newSeq2);
							if (compareArrays(newSeq, newSeq2)){
//								System.out.println("true");
//								printArrayLinear(newSeq);
//								printArrayLinear(newSeq2);
//								System.out.println(seqLength);
//								System.out.println((seqLength > max));
								if (seqLength > max) {
									max = seqLength;
								}
//								System.out.println(max);
//								System.out.println(" ");
							}
						}
					}
				}
				
			}
		}
		

		return max;
	}
	
	public static boolean compareArrays(int[] arr1, int[] arr2) {
		if(arr1.length != arr2.length) {
			return false;
		}
		else{			
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					return false;
				}
			}
			return true;
		}
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
