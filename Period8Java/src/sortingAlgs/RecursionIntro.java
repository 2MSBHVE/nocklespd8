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
		
		hanoiSolution(2, "a", "b", "c");
	}
	
	private static int count = 1;
	private static void printWCount(String s) {
		System.out.println("Move #" + count + ": " + s);
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
			System.out.println("Move " + startPeg + " to " + endPeg);
		}
		else {
			hanoiSolution(numDiscs - 1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(1, midPeg, startPeg, endPeg);
			
		}
	}
	
}
