package arrays;

public class ArraysPractice {

	public static void main(String[] args) {
////		how do you time a process
//		long startTime = System.currentTimeMillis();
//		
//		SampleElement sample = new SampleElement(10);
//		sample.increase();
//		System.out.println("The sample element has a number equal to " + sample.getNumber());
//		
//		long endTime = System.currentTimeMillis();
//		System.out.println("Completed method in " + (endTime - startTime) + " milliseconds");
//		
////		String[] someStrings = new String[1000];
////		standardPopulate(someStrings);
////		String s = someStrings[999];
////		
////		printArray(someStrings);
		
//		1
//		int[] fiftyNums = populateSeqInts(1, 50);
//		printArray(fiftyNums);
		
//		2
//		int minRandInt = -25;
//		int maxRandInt = 500;
//		int randIntArrayLength = 10000;
//		int[] randNums = populateRandInts(minRandInt, maxRandInt, randIntArrayLength);
//		int[] randIntArrayResults = new int[randIntArrayLength];
//		printArray(randNums);
		
////		3
//		int totalRolls = 2000;
//		int[] rolls = new int[totalRolls];
//		int[] results = new int[12];
//		//		declare variable, logic test, increment
//		for(int index = 0; index < totalRolls; index++) {
//			int rollOut = rollFairDie() + rollFairDie();
//			rolls[index] = rollOut;
//			results[rollOut-1]++;
////			System.out.println("Roll #" + (index + 1)+ ": " + rollOut);
//		}
//		printArray(results);
//		for(int i = 0; i < results.length; i++) {
//			double percentage = (int)(1000*(double)results[i]/totalRolls)/10.0;
//			System.out.println((i + 1)+ " appeared " + percentage + "% of the time.");
//		}
		
//		4
//		printArray(ListCardsInDeck());
		
		//		5
		Object[] newArrayForSwaps = {true, false, 3, 7.577, "Hi, I'm Paul!"};
		boolean[] bewArrayForSwaps = {false, false, false, true, true, true};
		
		printArray(swapArrayItems(2, 4, newArrayForSwaps));
	}
	
	private static void printArray(Object[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	private static Object[] swapArrayItems(int a, int b, Object[] array) {
		// TODO Auto-generated method stub
		Object storedObject;
		
		storedObject = array[a];
		array[a] = array[b];
		array[b] = storedObject;
		
		return array;
	}

	private static String[] ListCardsInDeck() {
		String[] cards = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] suits = {"Clubs","Hearts","Spades","Diamonds"};
		String[] deck = new String[cards.length * suits.length];
		for (int s = 0; s < suits.length; s++) {
			for (int c = 0; c < cards.length; c++) {
				deck[(s * cards.length) + c] = cards[c] + " of " + suits[s];
			}
		}
		return deck;
	}
	
	private static int rollFairDie(){
		double rand = Math.random();//returns a double (0,1)
		int roll = (int) (6*rand) + 1;//[1,6]
		return roll;
	}

	private static void standardPopulate(String[] a) {
		//this loop instantiating the strings
		for (int index = 0; index < a.length; index++) {
			a[index] = "String #" + (index + 1);
		}
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
	
	private static void printArray(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	private static void printArray(String[] a) {
		//this loop prints the strings
//		for(String s: a){
//			System.out.println(s);
//		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void initializingArraysExample(){
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
