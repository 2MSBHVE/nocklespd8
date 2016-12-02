package sortingAlgs;

public class RecursionIntro {

	public static void main(String[] args) {
//		System.out.println("Using a for loop:");
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Hello World! x " + i);
//		}
//		
//		System.out.println("Without using a for loop:");
//		forLoop(5, new Action() {
//			
//			private int value = 0;
//			
//			public void act() {
//				System.out.println("Hello World! x" + value);
//				value++;
//			}
//		});
		
//		System.out.println(factorial(7));
//		System.out.println(forctorial(7));
		
		hanoiSolution(8, "a", "b", "c");
		
		long n = 5;
//		System.out.println("The " + n + "th Fibonnacci is " + fibonacci(n));
	}
	
	private static long fibonacci(long n) {
		if (n <= 1) {
			return 1;
		}
		else {
			long previous = fibonacci(n-1);
//			printWCount("Before we find fibonacci " + n +", we need to find fibonacci " + (n-1) + ", which is " + previous);
			long prePrevious = fibonacci(n-1);
//			System.out.println(previous + prePrevious);
			return previous + prePrevious;
		}
	}

	private static int count = 1;
	private static void printWCount(String s) {
		System.out.println("Move #" + count + ": " + s);
		count++;
	}

	private static void forLoop(int i, Action action) {
		action.act();
		if(i > 1){
			forLoop(i-1, action);
		}
	}
	
	public static int factorial(int x) {
		if (x > 1) {
			return x * factorial(x-1);
		}
		return 1;
	}
	
	public static int forctorial(int x) {
		int val = 1;
		for (int i = x; i > 1; i++) {
			val = val*i;
		}
		
		return val;
		
//		if (x > 1) {
//			return x * factorial(x-1);
//		}
//		return 1;
	}

	
	
	
	public static void hanoiSolution(int numDiscs, String startPeg, String midPeg, String endPeg) {
		if (numDiscs <= 1) {
//			System.out.println("Move " + startPeg + " to " + endPeg);
			printWCount((String)("Move " + startPeg + " to " + endPeg));
		}
		else {
			System.out.println("In order to move " + numDiscs + " discs over to peg " + endPeg + ", we must move " + (numDiscs - 1) + " discs over to peg " + midPeg + " first");
			hanoiSolution(numDiscs - 1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(numDiscs - 1, midPeg, startPeg, endPeg);
			
		}
	}
	
}
