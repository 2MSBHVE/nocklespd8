package arrays;

public class ArraysPractice {

	public static void main(String[] args) {
//		2 diff ways to initiate an array
		boolean[] boos1 = new boolean[3];
//		this can only be done at the declaration
		boolean[] boos2 = {false, false, false};
//		int[] boos2a = {0,1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1,5,9,8,7,5,3,2,1,5,8,7,4,1,2,3,6,9};
		
		/**
		 * 2 WAYS OF ITERATING AN ARRAY
		 * Standard For Loop
		 * 		- the index is important to keep track of
		 * 		- you need to customize the order
		 */
		for (int i = 0; i < boos2.length; i++){
//			System.out.println(boos2[i]);
		}
//		System.out.println(boos2a);
		
		/**
		 * "FOR-EACH" LOOP
		 * 		- the index is not important
		 * 		- you dont need to customize
		 * 		- automatically assigns a "handle"
		 */
		for(boolean b: boos2){
//			System.out.println(b);
		}
		
		String[] someStrings1 = new String[3];
		String[] someStrings2 = {"a", "b", "c"};
		
		for (int i = 0; i < someStrings1.length; i++) {
			someStrings1[i] = "a new String";
		}
		
		for(String s: someStrings1){
			System.out.println(s);
		}
		
	}

}
