package introduction;

import java.util.Scanner;

public class StringPractice {
	
	static Scanner input;
	static String user;
	
	public static void main(String[] args) {
//		demonstrateStringMethods();
		createFields();
		promptName();
//		promptInput("Please type something.");
		promptInputForever((String)("Please type something, " + user + "."));
//		while(true){
//			println(input.next());
//		}
	}
	
	public static void promptName() {
		println("Enter your name.");
		user = input.nextLine();
		printwrap("Okay. For the rest of time, I will call you " + user + ". You may call me Computer. We should become friends.");
		
	}

	public static void promptInput(String prompt) {
		println(prompt);
		String userInput = input.nextLine();
		println("Congratulations! You typed: " + userInput);
	}

	private static void promptInputForever(String prompt) {
		while(true){
			promptInput(prompt);
		}
	}
	
	public static void createFields() {
		input = new Scanner(System.in);
		user = "";
	}

	public static void demonstrateStringMethods(){
		String text1 = new String("Hello World!");
		String text2 = "Hello World!"; //same as above
		
		if(text1.equals(text2)){ //.equals(---) is very important
			print("true");
		}
		
		Scanner wordScan = new Scanner(System.in);
		String word1 = wordScan.next();
		String word2 = wordScan.next();
		
		System.out.println(word1.compareTo(word2) < 0);
	}
	
	public static void println(String s){
		System.out.println(s);
	}
	public static void print(String s){
		System.out.print(s);
	}
	
	public static void printwrap(String s){
		String printString = s;
		int cutoff = 45;
		if(printString.length() > cutoff){
			for(int i = 0; i < s.length(); i++){
				printString = getCut(s, cutoff, i);
			}
		}
		
		System.out.println(printString);
	}
	
	private static String getCut(String s, int cutoff, int cut){
		int cutIndex = cut * cutoff;
		String currentCut = s.substring(0,cutIndex);
		
		int indexOfLastSpace = currentCut.length();
		for(int i = currentCut.length()-1; i >= 0; i--){
			String letter = currentCut.substring(i, i+1);
//			System.out.println(letter);
			if(letter.equals(" ")){
				indexOfLastSpace = i;
				break;
			}
		}
		
//		shorten the cut to end on a space
		currentCut = currentCut.substring(0, indexOfLastSpace);
		return currentCut;
	}

}
